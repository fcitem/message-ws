package com.message.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.message.entity.TabMsgBack;

/**封装注解方式动态sql工具类
 * @author fengchao
 * @data 2017年5月27日
 * @see com.message.dao.SqlMapper
 */
public class SqlUtil {

	/**
	 * @author fengchao
	 * @data 2017年5月26日
	 * @注释 查询中间表中的数据对应的相应映射表的数据
	 * @param tablename
	 *            映射表名称
	 * @param clumnlist
	 *            映射表待查字段
	 * @param clumn
	 *            映射表关联中间表的字段
	 * @param code
	 *            映射表的业务类型代码
	 */
	public String selectByTableAndCode(Map<String, Object> map) {
		final String clumn = (String) map.get("clumn");
		final String clumnlist = (String) map.get("clumnlist");
		final String tablename = (String) map.get("tablename");
		final String code = (String) map.get("code");
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT * FROM( SELECT tmp.*, ROWNUM RN FROM (").append(new SQL() {
							{
								SELECT(clumnlist);
								FROM(tablename);
								WHERE(clumn + " in " + "(select business_no from tab_business_records where extcode='"
										+ code + "')");
							}
						}.toString());
		sql.append(")tmp WHERE ROWNUM <= 1000)").append(" WHERE RN >= 0");
		return sql.toString();
	}

	/**
	 * @author fengchao
	 * @data 2017年5月27日
	 * @注释 针对于oracle的批量插入
	 * @param map 
	 * 参数map包括批量插入的列名clumnlist,操作的表tablename,符合values的数据集
	 */
	public String insertBatch(Map<String, Object> map) {
		String clumnlist = (String) map.get("clumnlist");
		String tablename = (String) map.get("tablename");
		@SuppressWarnings("unchecked")
		List<TabMsgBack> msglist = (List<TabMsgBack>) map.get("values");
		StringBuilder sql = new StringBuilder("insert ALL");
		for (TabMsgBack tabMsgBack : msglist) {
			sql.append(" into ").append(tablename);
			sql.append(" (").append(clumnlist).append(")");
			sql.append(" values (").append(tabMsgBack.getMsgString()).append(")");
		}
		sql.append(" SELECT 1 FROM DUAL");
		return sql.toString();
	}
	/**统计回复库里面是否已经存在相同电话号码,相同业务类型的回复短信
	 * @author fengchao
	 * @data 2017年7月8日
	 */
	public String countByCodeAndPhone(Map<String, String> map){
		StringBuffer sql=new StringBuffer("select count(*) from TAB_SMS_RECEIVE r inner join tab_sms_back m on m.sms_id=r.sms_id");
		sql.append(" and m.contacts_phone ='").append(map.get("phone")).append("' and m.business_type='").append(map.get("code")).append("'");
		if(!map.get("smsType").equals("0")){    //是否标准回复,为0肯定不是标准回复
			sql.append(" and m.sms_type='").append(map.get("smsType")).append("'");
		}
		sql.append(" and m.sms_state=2");       //状态为发送成功
		return sql.toString();
	}
	/**获取7天之内未回复的短信
	 * @author fengchao
	 * @data 2017年7月8日
	 */
	public String getNotReplayMsg(Date time){
		StringBuilder sql=new StringBuilder();
		SimpleDateFormat format=new SimpleDateFormat("YYYY-MM-dd");
		sql.append("select * from TAB_SMS_BACK m where m.SMS_STATE=2 and SMS_TIME <to_date(").append("'").append(format.format(time)).append("'");
		sql.append(",'YYYY-MM-DD')").append(" and ROWNUM<=500");
		return sql.toString();
	}
}
	

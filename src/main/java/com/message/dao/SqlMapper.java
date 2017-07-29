package com.message.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.SelectProvider;

/**注解方式动态sql封装引用
 * @author fengchao
 * @data 2017年5月27日
 */
public interface SqlMapper {

	/**自定义sql，动态查寻被抽取库映射字段数据
	 * @author fengchao
	 * @data 2017年5月27日
	 */
	@SelectProvider(type=com.message.util.SqlUtil.class, method="selectByTableAndCode")  
    List<HashMap<String, Object>> selectByTableAndCode(Map<String,Object> map);
	/**针对于oracle格式的批量插入
	 * @author fengchao
	 * @data 2017年5月27日
	 */
	@SelectProvider(type=com.message.util.SqlUtil.class, method="insertBatch")
	List<HashMap<String, Object>> insertBatch(Map<String,Object> map);
	
	/**查询短信回复库里面相同电话号码的记录是否存在
	 * @author fengchao
	 * @data 2017年6月9日
	 */
	@SelectProvider(type=com.message.util.SqlUtil.class, method="countByCodeAndPhone")
	public int countByCodeAndPhone(Map<String, String> map);
	
	@SelectProvider(type=com.message.util.SqlUtil.class, method="getNotReplayMsg")
	public List<HashMap<String, Object>> getNotReplayMsg(Date time);
}

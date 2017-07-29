package com.message.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.message.entity.TabMsgBack;
import com.message.entity.TabMsgBackExample;

public interface TabMsgBackService {

	int countByExample(TabMsgBackExample example);

    int deleteByExample(TabMsgBackExample example);

    int deleteByPrimaryKey(String smsId);

    int insert(TabMsgBack record);

    int insertSelective(TabMsgBack record);

    List<TabMsgBack> selectByExample(TabMsgBackExample example);

    TabMsgBack selectByPrimaryKey(String smsId);

    int updateByExampleSelective(@Param("record") TabMsgBack record, @Param("example") TabMsgBackExample example);

    int updateByExample(@Param("record") TabMsgBack record, @Param("example") TabMsgBackExample example);

    int updateByPrimaryKeySelective(TabMsgBack record);

    int updateByPrimaryKey(TabMsgBack record);
    //自定义动态sql查询
    List<HashMap<String, Object>> selectByTableAndCode(Map<String,Object> map);
    
    /**
     * @author fengchao
     * @data 2017年5月27日
     * @注释 注解形式批量插入
     * @param msglist 抽取的数据列表
     * @param code 业务类型
     * @param tablename 批量插入操作的数据库表
     * @param clumnlist 插入数据对应的列
     */
    List<HashMap<String, Object>> insertBatch(List<TabMsgBack> msglist,String code,String tablename,String clumnlist);
    
    /**
     * @author fengchao
     * @data 2017年5月27日
     * @注释 xml批量插入形式
     */
    int msgInsert(List<TabMsgBack> list);
    
    int updateSmsToSendSuccess(@Param("record") HashMap<String,String> map);
    
    List<TabMsgBack> selectNotSendByPage(TabMsgBackExample example);
    
    /**查询未回复短信
     * @author fengchao
     * @data 2017年7月8日
     */
    List<HashMap<String, Object>> getNotReplay(Date time);
}

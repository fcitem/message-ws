package com.message.dao;

import com.message.entity.TabMsgBack;
import com.message.entity.TabMsgBackExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabMsgBackMapper {
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
    //批量插入
    int msgInsert(List<TabMsgBack> list);
    
    int updateSmsToSendSuccess(@Param("record") HashMap<String,String> map);
    
    List<TabMsgBack> selectNotSendByPage(TabMsgBackExample example);
}
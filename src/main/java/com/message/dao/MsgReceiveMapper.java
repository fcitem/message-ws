package com.message.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.message.entity.MsgReceive;
import com.message.entity.MsgReceiveExample;

public interface MsgReceiveMapper {
    int countByExample(MsgReceiveExample example);

    int deleteByExample(MsgReceiveExample example);

    int deleteByPrimaryKey(String receiveId);

    int insert(MsgReceive record);

    int insertSelective(MsgReceive record);

    List<MsgReceive> selectByExample(MsgReceiveExample example);

    MsgReceive selectByPrimaryKey(String receiveId);

    int updateByExampleSelective(@Param("record") MsgReceive record, @Param("example") MsgReceiveExample example);

    int updateByExample(@Param("record") MsgReceive record, @Param("example") MsgReceiveExample example);

    int updateByPrimaryKeySelective(MsgReceive record);

    int updateByPrimaryKey(MsgReceive record);
    
    int batchInsert(List<MsgReceive> list);
}
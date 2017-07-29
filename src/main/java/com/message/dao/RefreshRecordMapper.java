package com.message.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.message.entity.RefreshRecord;
import com.message.entity.RefreshRecordExample;
import com.message.entity.RefreshRecordKey;

public interface RefreshRecordMapper {
    int countByExample(RefreshRecordExample example);

    int deleteByExample(RefreshRecordExample example);

    int deleteByPrimaryKey(RefreshRecordKey key);

    int insert(RefreshRecord record);

    int insertSelective(RefreshRecord record);

    List<RefreshRecord> selectByExample(RefreshRecordExample example);

    RefreshRecord selectByPrimaryKey(RefreshRecordKey key);

    int updateByExampleSelective(@Param("record") RefreshRecord record, @Param("example") RefreshRecordExample example);

    int updateByExample(@Param("record") RefreshRecord record, @Param("example") RefreshRecordExample example);

    int updateByPrimaryKeySelective(RefreshRecord record);

    int updateByPrimaryKey(RefreshRecord record);
}
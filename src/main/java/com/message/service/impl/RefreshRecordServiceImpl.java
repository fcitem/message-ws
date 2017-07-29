package com.message.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.message.dao.RefreshRecordMapper;
import com.message.entity.RefreshRecord;
import com.message.entity.RefreshRecordExample;
import com.message.entity.RefreshRecordKey;
import com.message.service.RefreshRecordService;

@Service
public class RefreshRecordServiceImpl implements RefreshRecordService {

	@Autowired
	RefreshRecordMapper mapper;
	@Override
	public int countByExample(RefreshRecordExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(RefreshRecordExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(RefreshRecordKey key) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(RefreshRecord record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(RefreshRecord record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<RefreshRecord> selectByExample(RefreshRecordExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public RefreshRecord selectByPrimaryKey(RefreshRecordKey key) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByExampleSelective(RefreshRecord record, RefreshRecordExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(RefreshRecord record, RefreshRecordExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(RefreshRecord record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(RefreshRecord record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

}

package com.message.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.message.dao.MsgReceiveMapper;
import com.message.dao.SqlMapper;
import com.message.entity.MsgReceive;
import com.message.entity.MsgReceiveExample;
import com.message.service.MsgReceiveService;

@Service
public class MsgReceiveServiceImpl implements MsgReceiveService {

	@Autowired
	MsgReceiveMapper mapper;
	@Autowired
	SqlMapper sqlmapper;
	@Override
	public int countByExample(MsgReceiveExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MsgReceiveExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String receiveId) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(receiveId);
	}

	@Override
	public int insert(MsgReceive record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(MsgReceive record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<MsgReceive> selectByExample(MsgReceiveExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public MsgReceive selectByPrimaryKey(String receiveId) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(receiveId);
	}

	@Override
	public int updateByExampleSelective(MsgReceive record, MsgReceiveExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MsgReceive record, MsgReceiveExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MsgReceive record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MsgReceive record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int countByCodeAndPhone(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sqlmapper.countByCodeAndPhone(map);
	}

	@Override
	public int batchInsert(List<MsgReceive> list) {
		// TODO Auto-generated method stub
		return mapper.batchInsert(list);
	}

}

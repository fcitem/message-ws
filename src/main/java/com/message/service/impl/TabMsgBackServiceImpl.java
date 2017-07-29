package com.message.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.message.dao.SqlMapper;
import com.message.dao.TabMsgBackMapper;
import com.message.entity.TabMsgBack;
import com.message.entity.TabMsgBackExample;
import com.message.service.TabMsgBackService;

@Service
@Transactional
public class TabMsgBackServiceImpl implements TabMsgBackService {
	@Autowired
	TabMsgBackMapper mapper;
	
	@Autowired
	SqlMapper sqlmapper;

	@Override
	public int countByExample(TabMsgBackExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TabMsgBackExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String smsId) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(smsId);
	}

	@Override
	public int insert(TabMsgBack record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TabMsgBack record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<TabMsgBack> selectByExample(TabMsgBackExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public TabMsgBack selectByPrimaryKey(String smsId) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(smsId);
	}

	@Override
	public int updateByExampleSelective(TabMsgBack record, TabMsgBackExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TabMsgBack record, TabMsgBackExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TabMsgBack record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TabMsgBack record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<HashMap<String, Object>> selectByTableAndCode(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return sqlmapper.selectByTableAndCode(map);
	}

	@Override
	public List<HashMap<String, Object>> insertBatch(List<TabMsgBack> msglist,String code,String tablename,String clumnlist) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map=new HashMap<String,Object>();
		map.put("tablename",tablename);
		map.put("clumnlist", clumnlist);
		map.put("values",msglist);
		return sqlmapper.insertBatch(map);
	}

	@Override
	public int msgInsert(List<TabMsgBack> list) {
		return mapper.msgInsert(list);
	}

	@Override
	public int updateSmsToSendSuccess(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return mapper.updateSmsToSendSuccess(map);
	}

	@Override
	public List<TabMsgBack> selectNotSendByPage(TabMsgBackExample example) {
		// TODO Auto-generated method stub
		return mapper.selectNotSendByPage(example);
	}

	@Override
	public List<HashMap<String, Object>> getNotReplay(Date time) {
		// TODO Auto-generated method stub
		return sqlmapper.getNotReplayMsg(time);
	}
}

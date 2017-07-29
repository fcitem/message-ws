package com.message.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.message.dao.TabMsgTemplateMapper;
import com.message.entity.TabMsgTemplate;
import com.message.entity.TabMsgTemplateExample;
import com.message.service.MsgTemplateService;

@Service
public class MsgTemplateServiceImpl implements MsgTemplateService{

	@Autowired
	TabMsgTemplateMapper mapper;
	@Override
	public int countByExample(TabMsgTemplateExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TabMsgTemplateExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int insert(TabMsgTemplate record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TabMsgTemplate record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<TabMsgTemplate> selectByExample(TabMsgTemplateExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(TabMsgTemplate record, TabMsgTemplateExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TabMsgTemplate record, TabMsgTemplateExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

}

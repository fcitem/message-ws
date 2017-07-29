package com.message.util;

import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;

import com.message.entity.TabMsgBackExample;
import com.message.entity.TabMsgBackExample.Criteria;
import com.message.service.TabMsgBackService;

public class ReceiveMsgFuture implements Callable<Boolean> {

	@Autowired
	TabMsgBackService service;
	private TabMsgBackExample example;
	private Criteria cia=example.createCriteria();
	
	@Override
	public Boolean call() throws Exception {
		while(service.countByExample(example)==0){
			Thread.sleep(2000);
		}
		return true;
	}
	public void setCriteria(String code,String phone){
		this.cia.andBusinessTypeEqualTo(code);
		this.cia.andContactsPhoneEqualTo(phone);
		this.cia.andSmsStateEqualTo((short) 2);
	}
	
}

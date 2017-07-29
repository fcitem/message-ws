package com.message.job;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.message.entity.MsgReceive;
import com.message.entity.TabMsgBack;
import com.message.entity.TabMsgBackExample;
import com.message.entity.TabMsgBackExample.Criteria;
import com.message.service.MsgReceiveService;
import com.message.service.TabMsgBackService;
import com.message.util.LoggerUtil;

/**
 * 处理7天之内未回复的短信,默认为满意
 * 
 * @author fengchao
 * @data 2017年7月8日
 */
public class HandleNotReplay {

	@Autowired
	TabMsgBackService msgService;

	@Autowired
	MsgReceiveService receiveService;
	
	LoggerUtil logger=LoggerUtil.getLogger(this);

	private static int invalidDay=0;           //短信发送的超期天数
	/**
	 * 更新任务开始
	 * @author fengchao
	 * @data 2017年7月8日
	 */
	public void handleMsg() {
		logger.info("************处理规定时间内未回复短信视为满意任务开始执行******************");
		Calendar date = Calendar.getInstance();
		date.setTime(new Date());
		date.set(Calendar.DATE, date.get(Calendar.DATE)-invalidDay); // 只匹配7天之前的未回复短信
		Date time = date.getTime();
		List<HashMap<String, Object>> list = msgService.getNotReplay(time);
		while(list.size() == 500) {
			updateSms(time, list);
			list = msgService.getNotReplay(time);
		}
		if(list.size()>0){
			updateSms(time, list);
		}
	}
	
	/**更新未回复短信默认回复满意
	 * @author fengchao
	 * @data 2017年7月10日
	 */
	public void updateSms(Date time,List<HashMap<String, Object>> list){
		TabMsgBackExample example=new TabMsgBackExample();
		Criteria cia=  example.createCriteria();
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
		List<MsgReceive> msglist = new ArrayList<>();      //批量插入临时列表
		for (HashMap<String, Object> obj : list) {
			String id = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 32);
			MsgReceive receive = new MsgReceive();
			receive.setReceiveId(id);
			if (obj.get("SMS_TYPE").equals(1)) {
				receive.setContent("1");
				receive.setReceiveType((short) 1);
			} else {
				receive.setContent("Y");
				receive.setReceiveType((short) 2);
			}
			receive.setNormalState((short) 1);
			receive.setReceiveTime(new Date());
			receive.setSmsId(obj.get("SMS_ID").toString());
			try {
				receive.setCreateTime(format.parse(obj.get("CREATE_TIME").toString()));
				receive.setSmsTime(format.parse(obj.get("SMS_TIME").toString()));
			} catch (ParseException e) {
				logger.error(e);
			}
			receive.setSmsOrder((short) 0); // 未生成工单
			msglist.add(receive);
		}
		try{
			if(receiveService.batchInsert(msglist)<=0){
				logger.info("***************定时更新7天内未回复短信默认满意失败****************");
			}
		}catch (Throwable e) {
			logger.error(e);
		}
		TabMsgBack msgback=new TabMsgBack();
		msgback.setSmsState((short) 4);   //已回复
		cia.andSmsStateEqualTo((short) 2);  //发送成功
		cia.andSmsTimeLessThanOrEqualTo(time);
		msgService.updateByExampleSelective(msgback, example);
	}

	public static int getInvalidday() {
		return invalidDay;
	}

	public static void setInvalidDay(int invalidDay) {
		HandleNotReplay.invalidDay = invalidDay;
	}
	
}

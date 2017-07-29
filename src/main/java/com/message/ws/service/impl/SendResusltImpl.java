package com.message.ws.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;

import com.message.entity.MsgReceive;
import com.message.entity.TabMsgBack;
import com.message.entity.TabMsgBackExample;
import com.message.entity.TabMsgBackExample.Criteria;
import com.message.service.MsgReceiveService;
import com.message.service.TabMsgBackService;
import com.message.util.LoggerUtil;
import com.message.util.MsgBackPool;
import com.message.ws.service.SendResult;

/**开放短信回复接口与短信发送结果接口
 * @author fengchao
 * @data 2017年6月9日
 */
public class SendResusltImpl implements SendResult {

	@Autowired
	TabMsgBackService msgService;

	@Autowired
	MsgReceiveService receiveService;

	Lock lock = new ReentrantLock();
	private static Document document;
	private static Element root;
	private static final Pattern p = Pattern.compile("(\\d{1})||(\\w{1})");   //回复的一个数字或者字母
	LoggerUtil logger = LoggerUtil.getLogger(this);

	@Override
	public String UpdateResult(String request) {
		StringBuffer buffer = new StringBuffer(); // webservice调用回复结果消息
		logger.info("***********调用短信发送结果接口开始*******************");
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		buffer.append("<RESPONSE>");
		logger.debugger("********************" + request + "***********************");
		try {
			ConcurrentHashMap<String, String> map = parseRequest(request);
			if (updateMsgStatus(map.get("smsid"), map.get("phone"), map.get("result"))) {
				buffer.append("<result>").append("1").append("</result>"); // 调用成功
			} else {
				buffer.append("<result>").append("0").append("</result>"); // 调用失败
				logger.info("***********调用短信发送结果接口更新失败:"+buffer.toString());
			}
		} catch (Exception e) {
			logger.info("**********调用短信发送结果接口出现异常,调用失败: "+e.getMessage()+"**********");
            logger.error(e);
			buffer.append("<result>").append("0").append("</result>");
		}
		buffer.append("</RESPONSE>");
		logger.debugger("***********调用短信发送结果接口结束:"+buffer.toString());
		return buffer.toString();
	}

	@Override
	public String ReplyResult(String request) {
		StringBuffer buffer = new StringBuffer(); // webservice调用回复结果消息
		TabMsgBackExample example=new TabMsgBackExample();
		Criteria cia=example.createCriteria();
		logger.info("***********调用短信回复接口开始*******************8");
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		buffer.append("<RESPONSE>");
		try {
			ConcurrentHashMap<String, String> map = parseRequest(request);
			if (receiveService.countByCodeAndPhone(map) == 0) { // 如果短信回复库里面已经存在同业务类型且电话相同的记录,不再入库
				logger.info("*********已收到手机号为:" + map.get("phone") + "的回复信息**************");
				cia.andBusinessTypeEqualTo(map.get("code"));
				cia.andContactsPhoneEqualTo(map.get("phone"));
				cia.andSmsStateEqualTo((short) 2); // 且状态为发送成功
				Calendar date = Calendar.getInstance();
				date.setTime(new Date());
				date.set(Calendar.DATE,date.get(Calendar.DATE)-7);    //只匹配7天之内的未回复短信
				Date startDate=date.getTime();
				cia.andSmsTimeBetween(startDate, new Date());
				String smsType=map.get("smsType");     //短信种类
				if(!smsType.equals("0")){   //标准回复
					cia.andSmsTypeEqualTo(Short.valueOf(smsType).shortValue());
					//如果没有查到相应的数据,说明type类型错误,为不标准回复
					if(msgService.countByExample(example)==0){  
						cia.getCriteria().remove(cia.getCriteria().size()-1);
					}
				} 
				example.setOrderByClause("sms_time"); // 根据发送时间排序
				example.setDistinct(true); // 降序，取最新的一条
				//有可能因为结果状态还没更新成功,便查询不到相应结果.
				lock.lock();
				List<TabMsgBack> list = msgService.selectByExample(example);
				if (list.size() == 0){   //没有找到相应的短信发送记录
					logger.info("*********** 电话号码为:"+map.get("phone")+"的回复短信更新失败,可能是由于回复时间超期!************");
				} else {
					updateReceiveMsg(list.get(0),map.get("result"));
				}
				lock.unlock();
			}
			else{
				logger.info("**************回复库里面已经存在相应的记录 "+map.get("phone")+" ****************");
			}
			
			buffer.append("<Result>").append("1").append("</Result>");
		} catch (Exception e) {
			logger.info("**************短信回复信息调用失败  "+e.getMessage()+"****************");
			logger.error(e);
			buffer.append("<Result>").append("0").append("</Result>");
		}
		buffer.append("</RESPONSE>");
		logger.debugger("***********调用短信回复结果接口结束*******************");
		return buffer.toString();
	}

	/**
	 * 对调用请求中的xml字符解析
	 * @author fengchao
	 * @data 2017年5月28日
	 */
	public ConcurrentHashMap<String, String> parseRequest(String data) throws Exception {
		data=data.toLowerCase();     //全部转换为小写，适应大小写
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		document = DocumentHelper.parseText(data);
		root = document.getRootElement();
		map.put("phone", root.elementText("calledid"));
		map.put("code", root.elementText("extcode"));
		String result=root.elementText("result");
		map.put("result",result);
		map.put("smsType",String.valueOf(matchNormal(result)));
		if(root.element("smsid")!=null){
			map.put("smsid",root.elementText("smsid"));
		}
		return map;
	}

	/**
	 * 更新短信发送结果状态
	 * @author fengchao
	 * @data 2017年5月29日
	 */
	public Boolean updateMsgStatus(String smsid,String phone,String result) {
		TabMsgBackExample example=new TabMsgBackExample();
		Criteria cia=example.createCriteria();
		cia.andSmsIdEqualTo(smsid);     //更新相应的短信发送结果
		try {
			MsgBackPool pool = MsgBackPool.getMsgBackPool();
			TabMsgBack msg = pool.getObj();
			if (result.equals("1")) {
				logger.info("*********已收到手机号为:" + phone + "的发送结果为:成功**************");
				msg.setSmsState((short) 2); // 发送成功
			} else {
				logger.info("*********已收到手机号为:" + phone + "的发送结果为:失败**************");
				msg.setSmsState((short) 3); // 发送失败
			}
			logger.debugger("*******************更新发送结果状态开始****************");
			int flag = msgService.updateByExampleSelective(msg, example);
			if (flag > 0) {// 更新相应的短信状态
				pool.putItem(msg);
				return true;
			} else {
				logger.info("*******************更新发送结果状态失败****************");
				pool.putItem(msg);
				return false;
			}
		} catch (Exception e) {
			logger.info("**********调用短信发送结果接口出现异常,调用失败: "+e.getMessage()+" 收到的smsid为:"+smsid+"**********");
			logger.error(e);
			return false;
		}
	}

	/**解析结果是否为标准回复
	 * @author fengchao
	 * @data 2017年5月29日
	 * @return 0/非标准回复;1/短信回访;2/工单回访 
	 */
	public static int matchNormal(String str) {
		Matcher m = p.matcher(str);
		if(m.matches()){
			if(m.group(1)!=null){     //数字，代表第一次回复
				return 1;
			}
			else if(m.group(2)!=null) { //字母,代表第二次回复
				return 2;
			}
		}
		return 0;
	}
	/**新增回复短信
	 * @author fengchao
	 * @param smsType 
	 * @data 2017年5月30日
	 */
	public void updateReceiveMsg(TabMsgBack msg,String result){
		MsgReceive obj = new MsgReceive();
		obj.setReceiveId(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 32));
		obj.setSmsId(msg.getSmsId());
		obj.setReceiveTime(new Date());
		obj.setContent(result);
		obj.setSmsOrder((short) 0);    //0代表未生成工单
		Short smsType=msg.getSmsType();
		obj.setReceiveType(smsType);
		obj.setCreateTime(msg.getCreateTime());
		obj.setSmsTime(msg.getSmsTime());
		if(smsType==1){    //第一次回访
			if (result.equals("1")) { // 满意
				obj.setNormalState((short) 1);
			} else if (result.equals("2")) { // 一般
				obj.setNormalState((short) 2);
			} else if(result.equals("3")){ // 不满意
				obj.setNormalState((short) 3);
			}else{
				obj.setNormalState((short) 0); // 非标准回复
			}
		}
		else if(smsType==2){   //第二次回访
			if (result.equalsIgnoreCase("Y")) { // 满意
				obj.setNormalState((short) 1);
			} else if (result.equalsIgnoreCase("N")) { //不满意
				obj.setNormalState((short) 2);
			}else{
				obj.setNormalState((short) 0); // 非标准回复
			}
		}else {
			obj.setNormalState((short) 0); // 非标准回复
		}
		receiveService.insertSelective(obj);
	}
}

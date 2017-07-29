package com.message.util;

import java.util.Date;
import java.util.concurrent.Callable;

import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.message.entity.TabMsgBack;
import com.message.service.TabMsgBackService;

/**
 * @author fengchao
 * @data 2017年5月29日
 * @注释 异步调用task 异步调用远程webservice接口
 */
public class SendFuture implements Callable<Boolean> {

	TabMsgBackService msgService; // 短信库service

	private static final JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
	private static String address = "http://10.38.6.206:8787/tw_wsserver/ExternalServicesServerImpl?wsdl";
	private QName name = new QName("http://services", "SendShortMsg");

	LoggerUtil log = LoggerUtil.getLogger(this);

	private static Client client;
	private StringBuilder msg = new StringBuilder(); // 发送的内容
	private TabMsgBack tabMsgBack;

	public SendFuture(String wsaddress) {
		if (client == null) {
			client = dcf.createClient(wsaddress);
		}
	}

	@Override
	public Boolean call() throws Exception {
		String str = generateMsg(); // 生成消息
		Object[] objects = client.invoke(name, str);
		if (!preaseResult(objects[0].toString())) { // 失败，再调用3次
			/*for (int i = 0; i < 2; i++) {
				Object[] res = client.invoke(name, str);
				if (preaseResult(res[0].toString())) {
					updateMsgSendState(true);
					return true; // 成功
				}
			}*/
			updateMsgSendState(false);
			return false; // 三次调用结束，调用失败
		}
		updateMsgSendState(true);
		return true; // 调用接口成功
	}

	/**
	 * @author fengchao
	 * @data 2017年5月29日
	 * @注释 解析调用结果
	 */
	public Boolean preaseResult(String date) {
		Document document = null;
		Element root = null;
		try {
			document = DocumentHelper.parseText(date);
			root = document.getRootElement();
			String result = root.elementText("result");
			if (result.equals("1")) {
				return true;
			}
		} catch (DocumentException e) {
			log.error(e);
		}
		return false;
	}

	/**
	 * @author fengchao
	 * @data 2017年5月30日
	 * @注释 根据短信发送接口调用的结果更新相应短信的状态
	 * @param flag
	 *            短信是否发送成功 true/成功 false/失败
	 */
	public void updateMsgSendState(boolean flag) {
		tabMsgBack.setSmsTime(new Date());
		if (flag) { // 调用成功
			tabMsgBack.setSmsState((short) 1);
			log.info("********发送成功的编号为:smsid=" + tabMsgBack.getSmsId() + " phone=" + tabMsgBack.getContactsPhone());
			try{
				msgService.updateByPrimaryKeySelective(tabMsgBack);
			}catch (Exception e) {
				log.error(e);
			}
		} else {
			tabMsgBack.setSmsState((short) 3);
			log.info("********发送失败的编号为:smsid=" + tabMsgBack.getSmsId() + " phone=" + tabMsgBack.getContactsPhone());
			try{
				msgService.updateByPrimaryKeySelective(tabMsgBack);
			}catch (Exception e) {
				log.error(e);
			}
		}
	}

	/**
	 * @author fengchao
	 * @data 2017年5月30日
	 * @注释 生成符合短信发送接口的消息
	 */
	public String generateMsg() {
		msg.delete(0, msg.length()); // 清空消息
		msg.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		msg.append("<REQUEST>");
		// 接收方号码
		msg.append("<CallerId></CallerId>");
		msg.append("<CalledId>").append(tabMsgBack.getContactsPhone()).append("</CalledId>");
		msg.append("<Content>").append(tabMsgBack.getContent()).append("</Content>"); // 短信内容
		msg.append("<EXTCode>").append(tabMsgBack.getBusinessType()).append("</EXTCode>");
		msg.append("<SMSID>").append(tabMsgBack.getSmsId()).append("</SMSID>");
		msg.append("</REQUEST>");
		return msg.toString();
	}

	public static String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		SendFuture.address = address;
	}

	public TabMsgBack getTabMsgBack() {
		return tabMsgBack;
	}

	public void setTabMsgBack(TabMsgBack tabMsgBack) {
		this.tabMsgBack = tabMsgBack;
	}

	public TabMsgBackService getMsgService() {
		return msgService;
	}

	public void setMsgService(TabMsgBackService msgService) {
		this.msgService = msgService;
	}
}

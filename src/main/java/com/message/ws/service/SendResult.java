package com.message.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(targetNamespace = "http://services.sms.com", portName = "smsService", serviceName = "smsServicePort")
@SOAPBinding(style=Style.RPC)
public interface SendResult {

	/**
	 * @author fengchao
	 * @data 2017年5月28日
	 * @注释 接收短信发送结果的接口
	 * @param request 请求参数 
	 * 示例  <?xml version="1.0" encoding="UTF-8"?>
	 * <REQUEST>
	 * <CalledId></CalledId><EXTCode></EXTCode><Result></Result>
	 * </REQUEST>
	 */
	@WebMethod
//	@WebResult(name="result")
	public String UpdateResult(@WebParam(name = "REQUEST") String request);
	
	/**
	 * @author fengchao
	 * @data 2017年5月28日
	 * @注释 接收短信回复接口
	 */
	public String ReplyResult(String request);
}

package com.message.job;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;

import com.message.entity.TabMsgBack;
import com.message.entity.TabMsgBackExample;
import com.message.entity.TabMsgBackExample.Criteria;
import com.message.service.TabMsgBackService;
import com.message.util.LoggerUtil;
import com.message.util.SendFuture;

/**
 * @author fengchao
 * @data 2017年5月27日
 * @注释 定时发送短信任务
 */
public class SendJob {

	@Autowired
	TabMsgBackService msgService; // 短信库service
	SAXReader reader = new SAXReader();
	private String wsAddress; // webservice短信接口地址,外部注入
	@SuppressWarnings("unused")
	private Object[] objects = null; // 调用发送结果
	ExecutorService service = Executors.newFixedThreadPool(10);
	LoggerUtil logger = LoggerUtil.getLogger(this);
	private final int count = 1000;    //每次查询1000条数据

	public void callWsInterface() {
		logger.info("************定时发送短信任务开始***************");
		TabMsgBackExample example=new TabMsgBackExample();
		Calendar date = Calendar.getInstance();
		date.setTime(new Date());
		date.set(Calendar.DATE,date.get(Calendar.DATE)-3);
		Criteria cia= example.createCriteria();
		cia.andSmsStateEqualTo((short) 0);   //状态
		cia.andSmsTypeEqualTo((short) 1);    //类型
		cia.andCreateTimeBetween(date.getTime(),new Date());
		List<TabMsgBack> list = msgService.selectNotSendByPage(example); // 查询代发短信信息
		HashMap<String,Future<?>> map=new HashMap<>();
		while(list.size()<=count&&list.size()>0){     //本轮发送结束
			
			for (TabMsgBack tabMsgBack : list) {
				SendFuture task = new SendFuture(this.getWsAddress());
				task.setMsgService(msgService);
				task.setTabMsgBack(tabMsgBack);
				map.put(tabMsgBack.getSmsId(),service.submit(task));
				 // 提交执行
			}
			try {
				updateSmsState(map);    //等待异步执行结果
				TimeUnit.MINUTES.sleep(1);          //暂停一分钟再发送下一批
				cia.getCriteria().clear();
				cia.andSmsStateEqualTo((short) 0);   //状态
				cia.andSmsTypeEqualTo((short) 1);    //类型
				cia.andCreateTimeBetween(date.getTime(),new Date());
				if(list.size()<count){
					break;
				}
				else{
					list = msgService.selectNotSendByPage(example);
				}
			} catch (Exception e) {
				logger.error(e);
			}
		}
	}

	/**
	 * @author fengchao
	 * @throws ExecutionException
	 * @throws InterruptedException
	 * @data 2017年5月27日
	 * @注释 更新短信调用发送接口的结果状态
	 * @param map
	 *            futureTask和对应的短信id存储的map
	 */
	private void updateSmsState(HashMap<String, Future<?>> map) throws InterruptedException, ExecutionException {
		for (Entry<String, Future<?>> sendFuture : map.entrySet()) {
			sendFuture.getValue().get();      // 等待所有的接口调用完成，更新状态为已发送
		}
		map.clear();
	}

	public String getWsAddress() {
		return wsAddress;
	}

	public void setWsAddress(String wsAddress) {
		this.wsAddress = wsAddress;
	}

}

package com.message.job;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;

import com.message.entity.RefreshRecordExample;
import com.message.entity.TabMsgBack;
import com.message.entity.TabMsgBackExample;
import com.message.entity.TabMsgBackExample.Criteria;
import com.message.entity.TabMsgTemplate;
import com.message.entity.TabMsgTemplateExample;
import com.message.service.MsgTemplateService;
import com.message.service.RefreshRecordService;
import com.message.service.TabMsgBackService;
import com.message.util.LoggerUtil;
import com.message.util.MsgBackPool;

/**
 * 定时生成短信类
 * 
 * @author fengchao
 * @data 2017年5月27日
 */
public class GenerateMsg {

	@Autowired
	TabMsgBackService msgService; // 短信库service

	@Autowired
	RefreshRecordService refreshService; // 中间库service

	@Autowired
	MsgTemplateService templeteService;

	private static TabMsgBackExample msgexample = new TabMsgBackExample();
	private static RefreshRecordExample refreshexample = new RefreshRecordExample();
	private static TabMsgTemplateExample templeteExample = new TabMsgTemplateExample();
	private static com.message.entity.RefreshRecordExample.Criteria refreshcia = refreshexample.createCriteria();
	private static com.message.entity.TabMsgTemplateExample.Criteria templetecia = templeteExample.createCriteria();
	private static Criteria cia = msgexample.createCriteria();
	private AtomicInteger count = new AtomicInteger(100);
	private MsgBackPool pool = MsgBackPool.getMsgBackPool();
	private static List<Element> mapperlist = new ArrayList<>(); // 存放所有被抽取表与短信表相关的映射规则
	static HashMap<String, Object> map = new HashMap<>();
	LoggerUtil log = LoggerUtil.getLogger(this);

	public GenerateMsg() {
		// 读取配置文件映射规则
		getSmsMapper();
	}

	private void clearCria() {
		cia.getCriteria().clear();
		refreshcia.getCriteria().clear();
		templetecia.getCriteria().clear();
	}

	/**
	 * 根据配置查询中间库对应的业务库映射字段的数据，存入短信库
	 * 
	 * @author fengchao
	 * @data 2017年5月27日
	 */
	public void getData() {
		log.info("*********定时生成短信任务开始执行*************");
		clearCria();
		for (Element element : mapperlist) { // 根据配置循环抽取中间库中对应不同业务库的映射数据
			map.clear();
			StringBuffer clumnlist = new StringBuffer(); // 存放业务库需要映射的字段列
			String code = element.attributeValue("extcode"); // 业务类型
			String contactsClumn = element.elementText("contacts"); // 联系人
			String phoneClumn = element.elementText("phonenNumber"); // 联系电话
			String busniessno = element.elementText("busniessno"); // 中间库与不同业务库之间的关联列
			String sponsorClumn = element.elementText("sponsor"); // 组办单位
			map.put("tablename", element.attributeValue("name")); // 表名
			map.put("code", code);
			map.put("clumn", busniessno);
			clumnlist.append(busniessno).append(",");
			clumnlist.append(contactsClumn).append(",");
			clumnlist.append(phoneClumn).append(",");
			clumnlist.append(sponsorClumn);
			map.put("clumnlist", clumnlist.toString());
			try {
				List<HashMap<String, Object>> list = msgService.selectByTableAndCode(map); // 查询中间表对应的业务表映射数据
				while (list.size() <= 1000) { // 分页查询每次查询1000条数据,直到查询当前批次的数据
					insertMsg(list, code, busniessno, sponsorClumn, phoneClumn, contactsClumn); // 组装数据生成符合短信库的数据同时入库
					// 入库后删除中间库对应的已经入了短信库的数据
					deleteRefreshRecords(list, busniessno);
					if (list.size() < 1000) { // 说明此次抽库结束
						break;
					} else {
						list.clear();
						list = msgService.selectByTableAndCode(map);
					}
				}
			} catch (Exception e) {
				log.error(e);
			}
		}
	}

	/**
	 * 删除中间库不需要更新的数据
	 * 
	 * @author fengchao
	 * @param busniessno
	 * @data 2017年5月27日
	 * 
	 */
	private void deleteRefreshRecords(List<HashMap<String, Object>> list, String busniessno) {
		clearCria();
		List<String> idlist = new ArrayList<>();
		for (HashMap<String, Object> hashMap : list) {
			idlist.add(hashMap.get(busniessno.toUpperCase()).toString());
		}
		if (idlist.size() > 0) { // 判断是否有需要删除的数据
			refreshcia.andBusinessNoIn(idlist);
			refreshService.deleteByExample(refreshexample);
		}
	}

	/**
	 * 解析配置文件
	 * 
	 * @author fengchao
	 * @data 2017年5月26日
	 */
	public void getSmsMapper() {
		// 读取配置文件
		SAXReader reader = new SAXReader();
		Document document = null;
		Element root = null;
		try {
			document = reader.read(this.getClass().getClassLoader().getResourceAsStream("sms_back.xml"));
			root = document.getRootElement();
			List<?> nodes = root.elements("table"); // 获取所有的table节点
			for (Object object : nodes) {
				mapperlist.add((Element) object);
			}
		} catch (Throwable e) {
			log.error(e);
		}
	}

	/**
	 * 查询相应的短信模板生成短信入库
	 * 
	 * @author fengchao
	 * @data 2017年5月29日
	 * @param code
	 *            业务类型代码
	 * @param sponsorClumn
	 *            主办单位映射业务库的列名
	 * @param list
	 *            业务库查询出来的数据列表,键为列名
	 * @param phoneClumn
	 *            联系电话映射业务库的列名
	 * @param contactsClumn
	 *            联系人映射业务库的列名
	 * @param busniessno
	 *            业务编号映射业务库的列名
	 */
	public void insertMsg(List<HashMap<String, Object>> list, String code, String busniessno, String sponsorClumn,
			String phoneClumn, String contactsClumn) {
		count.set(100);
		clearCria();
		List<TabMsgBack> msglist = new ArrayList<TabMsgBack>();
		HashSet<String> set = new HashSet<>();
		templetecia.andBusinessTypeEqualTo(code);
		templetecia.andEnableEqualTo((short) 1);
		// 查询相应业务类型的启用的短信模板
		List<TabMsgTemplate> tmplist = templeteService.selectByExample(templeteExample);
		String content = "";
		if (tmplist.size() == 1) { // 获取短信模板内容
			content = tmplist.get(0).getContent();
		}
		for (HashMap<String, Object> hashMap : list) {
			try {
				TabMsgBack msg = pool.getObj(); // 从对象池获取对象
				msg.setSmsId(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 32));
				msg.setBusinessType(code);
				msg.setSmsTime(new Date()); // 短信发送时间
				String sporsor = (String) hashMap.get(sponsorClumn.toUpperCase());
				msg.setSponsor(sporsor == null ? "" : sporsor); // 主办单位
				msg.setBusinessNo((String) hashMap.get(busniessno.toUpperCase())); // 业务编号
				String contact = (String) hashMap.get(contactsClumn.toUpperCase());
				msg.setContacts(contact == null ? "" : contact); // 联系人
				if (hashMap.get(phoneClumn.toUpperCase()) != null) {
					String phonenumber = ((String) hashMap.get(phoneClumn.toUpperCase())).replaceAll(" ", "");
					String phone = phonenumber.length() > 11 ? phonenumber.substring(0, 11) : phonenumber;
					if (phonenumber.length() == 0 || set.contains(phone) || (!checkPhone(phone))) {
						pool.putItem(msg); // 释放信号量
						continue;
					}
					set.add(phone);
					msg.setContactsPhone(phone == null ? "" : phone); // 联系电话
					msg.setContent(content); // 短信模板
					msg.setSmsState((short) 0); // 短信状态 为未发送
					msg.setSmsType((short) 1);
					msglist.add(msg);
					count.decrementAndGet();
					if (count.compareAndSet(1, 100)) {
						msgService.msgInsert(msglist); // 满100条进行一次批量插入
						pool.putListItem(msglist); // 释放信号量
						msglist.clear();
					}
				}
			} catch (InterruptedException e) {
				log.error(e);
			}
		}
		if (msglist.size() > 0) { // 判断是否有需要插入的数据
			msgService.msgInsert(msglist);
		}
		// msgService.insertBatch(msglist,code,"tab_sms_back","SMS_ID,BUSINESS_NO,BUSINESS_TYPE,CONTACTS,CONTACTS_PHONE,SPONSOR,CONTENT,SMS_STATE");
		// //满一百条进行一次插入
		pool.putListItem(msglist); // 释放信号量
	}

	/**
	 * @author fengchao
	 * @data 2017年5月27日
	 * @注释 匹配手机号码的格式校验
	 */
	public static Boolean checkPhone(String numbers) {
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,2,3,5-9])|(17[0,8]))\\d{8}$");
		Matcher matcher = p.matcher(numbers);
		return matcher.matches();
	}
}

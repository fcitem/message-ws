package com.message.util;

import java.util.List;
import java.util.concurrent.Semaphore;

import com.message.entity.TabMsgBack;

/**
 * @author fengchao
 * @data 2017年6月9日
 * @注释 对象池,合理利用空对象避免过度的new一大堆
 */
public class MsgBackPool {
	private static final int MAX_AVAILABLE = 110;     //最多创建100个对象
	private static final Semaphore available = new Semaphore(MAX_AVAILABLE, true);   //创建具有给定的许可数和给定的公平设置的
	protected boolean[] used = new boolean[MAX_AVAILABLE];     //记录对象是否被使用中
	protected TabMsgBack[] items =new TabMsgBack[MAX_AVAILABLE];     //对象数组
    protected static MsgBackPool pool;
	private  MsgBackPool() {
		for (int i = 0; i < items.length; i++) {
				items[i]=new TabMsgBack();
		}
	}
	public static MsgBackPool getMsgBackPool(){
		if(pool==null){
			pool=new MsgBackPool();      //单例
		}
		return pool;
	}
	public TabMsgBack getObj() throws InterruptedException {
	     available.acquire();                   //等待获取信号量
	     return getNextAvailableItem();
	}
	public void putItem(TabMsgBack obj) {
	     if (markAsUnused(obj))
	        obj.clear();          //清空对象
	       available.release();              //释放信号量
	}
	public void putListItem(List<TabMsgBack> list) {
	    for (TabMsgBack tabMsgBack : list) {
			putItem(tabMsgBack);                //逐个释放列表里面的所有元素的信号量
		}
	}
	private synchronized TabMsgBack getNextAvailableItem() {
	     for (int i = 0; i < MAX_AVAILABLE; ++i) {            //小于最大数量
	       if (!used[i]) {                                //且没有被使用
	          used[i] = true;
	          return items[i];
	       }
	     }
	     return null;         // not reached
	 }
	protected synchronized boolean markAsUnused(Object item) {
	     for (int i = 0; i < MAX_AVAILABLE; ++i) {
	       if (item == items[i]) {
	          if (used[i]) {
	            used[i] = false;
	            return true;
	          } else
	            return false;
	       }
	     }
	     return false;
	   }
}

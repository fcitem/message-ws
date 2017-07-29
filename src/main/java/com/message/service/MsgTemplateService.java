package com.message.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.message.entity.TabMsgTemplate;
import com.message.entity.TabMsgTemplateExample;

public interface MsgTemplateService {

	int countByExample(TabMsgTemplateExample example);

    int deleteByExample(TabMsgTemplateExample example);

    int insert(TabMsgTemplate record);

    int insertSelective(TabMsgTemplate record);

    List<TabMsgTemplate> selectByExample(TabMsgTemplateExample example);

    int updateByExampleSelective(@Param("record") TabMsgTemplate record, @Param("example") TabMsgTemplateExample example);

    int updateByExample(@Param("record") TabMsgTemplate record, @Param("example") TabMsgTemplateExample example);
}

package com.message.dao;

import com.message.entity.TabMsgTemplate;
import com.message.entity.TabMsgTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabMsgTemplateMapper {
    int countByExample(TabMsgTemplateExample example);

    int deleteByExample(TabMsgTemplateExample example);

    int insert(TabMsgTemplate record);

    int insertSelective(TabMsgTemplate record);

    List<TabMsgTemplate> selectByExample(TabMsgTemplateExample example);

    int updateByExampleSelective(@Param("record") TabMsgTemplate record, @Param("example") TabMsgTemplateExample example);

    int updateByExample(@Param("record") TabMsgTemplate record, @Param("example") TabMsgTemplateExample example);
}
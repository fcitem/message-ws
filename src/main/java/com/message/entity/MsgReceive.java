package com.message.entity;

import java.util.Date;

public class MsgReceive {
    private String receiveId;

    private String smsId;

    private String content;

    private Date receiveTime;

    private Short normalState;

    private Date createTime;

    private Short receiveType;

    private Short smsOrder;

    private Date smsTime;

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId == null ? null : receiveId.trim();
    }

    public String getSmsId() {
        return smsId;
    }

    public void setSmsId(String smsId) {
        this.smsId = smsId == null ? null : smsId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Short getNormalState() {
        return normalState;
    }

    public void setNormalState(Short normalState) {
        this.normalState = normalState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(Short receiveType) {
        this.receiveType = receiveType;
    }

    public Short getSmsOrder() {
        return smsOrder;
    }

    public void setSmsOrder(Short smsOrder) {
        this.smsOrder = smsOrder;
    }

    public Date getSmsTime() {
        return smsTime;
    }

    public void setSmsTime(Date smsTime) {
        this.smsTime = smsTime;
    }
}
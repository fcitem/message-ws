package com.message.entity;

import java.util.Date;

public class TabMsgBack {
    private String smsId;

    private String businessNo;

    private String businessType;

    private String contacts;

    private String contactsPhone;

    private String sponsor;

    private String content;

    private Short smsState;
    
    private Short smsType;

	private Date smsTime;

    private Date createTime;

    public String getSmsId() {
        return smsId;
    }

    public void setSmsId(String smsId) {
        this.smsId = smsId == null ? null : smsId.trim();
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo == null ? null : businessNo.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone == null ? null : contactsPhone.trim();
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor == null ? null : sponsor.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Short getSmsState() {
        return smsState;
    }

    public void setSmsState(Short smsState) {
        this.smsState = smsState;
    }

    public Date getSmsTime() {
        return smsTime;
    }

    public Short getSmsType() {
		return smsType;
	}

	public void setSmsType(Short smsType) {
		this.smsType = smsType;
	}

    public void setSmsTime(Date smsTime) {
        this.smsTime = smsTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public void clear(){
    	 this.smsId=null;

    	 this.businessNo=null;

    	 this.businessType=null;

    	 this.contacts=null;

    	 this.contactsPhone=null;

    	 this.sponsor=null;

    	 this.content=null;

    	 this.smsState=null;

    	 this.smsTime=null;
    	 
    	 this.smsType=null;

    	 this.createTime=null;
    }
    /**
     * 返回对象各字段封装成的values字符串
     * @author fengchao
     * @data 2017年7月8日
     */
    public String getMsgString() {
    	StringBuilder builder=new StringBuilder();
    	builder.append("'").append(this.smsId).append("',");
    	builder.append("'").append(this.businessNo).append("',");
    	builder.append("'").append(this.businessType).append("',");
    	builder.append("'").append(this.contacts).append("',");
    	builder.append("'").append(this.contactsPhone).append("',");
    	builder.append("'").append(this.content).append("',");
    	builder.append("'").append(this.sponsor).append("',");
    	builder.append(this.smsState).append("");
//    	builder.append("to_date('").append(this.smsTime).append("'");
    	return builder.toString();
	}
}
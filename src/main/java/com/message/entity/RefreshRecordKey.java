package com.message.entity;

public class RefreshRecordKey {
    private String businessNo;

    private String extcode;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo == null ? null : businessNo.trim();
    }

    public String getExtcode() {
        return extcode;
    }

    public void setExtcode(String extcode) {
        this.extcode = extcode == null ? null : extcode.trim();
    }
}
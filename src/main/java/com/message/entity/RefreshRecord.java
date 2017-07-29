package com.message.entity;

import java.util.Date;

public class RefreshRecord extends RefreshRecordKey {
    private Date rksjc;

    private String phoneno;

    public Date getRksjc() {
        return rksjc;
    }

    public void setRksjc(Date rksjc) {
        this.rksjc = rksjc;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno == null ? null : phoneno.trim();
    }
}
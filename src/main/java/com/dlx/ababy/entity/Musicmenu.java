package com.dlx.ababy.entity;

public class Musicmenu {
    private Integer mmId;

    private Integer mmUId;

    private String mmName;

    public Integer getMmId() {
        return mmId;
    }

    public void setMmId(Integer mmId) {
        this.mmId = mmId;
    }

    public Integer getMmUId() {
        return mmUId;
    }

    public void setMmUId(Integer mmUId) {
        this.mmUId = mmUId;
    }

    public String getMmName() {
        return mmName;
    }

    public void setMmName(String mmName) {
        this.mmName = mmName == null ? null : mmName.trim();
    }
}
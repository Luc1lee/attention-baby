package com.dlx.ababy.entity;

public class LeType {
    private Integer ltId;

    private String ltName;

    private Integer ltParentid;

    private Integer ltLevel;

    public Integer getLtId() {
        return ltId;
    }

    public void setLtId(Integer ltId) {
        this.ltId = ltId;
    }

    public String getLtName() {
        return ltName;
    }

    public void setLtName(String ltName) {
        this.ltName = ltName == null ? null : ltName.trim();
    }

    public Integer getLtParentid() {
        return ltParentid;
    }

    public void setLtParentid(Integer ltParentid) {
        this.ltParentid = ltParentid;
    }

    public Integer getLtLevel() {
        return ltLevel;
    }

    public void setLtLevel(Integer ltLevel) {
        this.ltLevel = ltLevel;
    }
}
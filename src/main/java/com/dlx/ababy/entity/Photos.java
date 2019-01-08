package com.dlx.ababy.entity;

public class Photos {
    private Integer ptId;

    private String ptName;

    private Integer ptUId;

    public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public String getPtName() {
        return ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName == null ? null : ptName.trim();
    }

    public Integer getPtUId() {
        return ptUId;
    }

    public void setPtUId(Integer ptUId) {
        this.ptUId = ptUId;
    }
}
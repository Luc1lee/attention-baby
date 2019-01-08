package com.dlx.ababy.entity;

public class Exchange {
    private Integer ecId;

    private String ecInfo;

    public Integer getEcId() {
        return ecId;
    }

    public void setEcId(Integer ecId) {
        this.ecId = ecId;
    }

    public String getEcInfo() {
        return ecInfo;
    }

    public void setEcInfo(String ecInfo) {
        this.ecInfo = ecInfo == null ? null : ecInfo.trim();
    }
}
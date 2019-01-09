package com.dlx.ababy.entity;

public class Lessons {
    private Integer leId;

    private String leName;

    private Double lePrice;

    private Integer leNum;

    private String leInfo;

    private Integer leLtId;

    private Integer leStatus;

    private Integer leMdId;

    private Integer leThId;

    public Integer getLeId() {
        return leId;
    }

    public void setLeId(Integer leId) {
        this.leId = leId;
    }

    public String getLeName() {
        return leName;
    }

    public void setLeName(String leName) {
        this.leName = leName == null ? null : leName.trim();
    }

    public Double getLePrice() {
        return lePrice;
    }

    public void setLePrice(Double lePrice) {
        this.lePrice = lePrice;
    }

    public Integer getLeNum() {
        return leNum;
    }

    public void setLeNum(Integer leNum) {
        this.leNum = leNum;
    }

    public String getLeInfo() {
        return leInfo;
    }

    public void setLeInfo(String leInfo) {
        this.leInfo = leInfo == null ? null : leInfo.trim();
    }

    public Integer getLeLtId() {
        return leLtId;
    }

    public void setLeLtId(Integer leLtId) {
        this.leLtId = leLtId;
    }

    public Integer getLeStatus() {
        return leStatus;
    }

    public void setLeStatus(Integer leStatus) {
        this.leStatus = leStatus;
    }

    public Integer getLeMdId() {
        return leMdId;
    }

    public void setLeMdId(Integer leMdId) {
        this.leMdId = leMdId;
    }

    public Integer getLeThId() {
        return leThId;
    }

    public void setLeThId(Integer leThId) {
        this.leThId = leThId;
    }
}
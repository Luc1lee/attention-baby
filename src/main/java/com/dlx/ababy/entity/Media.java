package com.dlx.ababy.entity;

public class Media {
    private Integer mdId;

    private String mdName;

    private String mdUrl;

    private Integer mdThId;

    private String mdInfo;

    private Integer mdType;

    private Double mdPrice;

    private Integer mdNum;

    private Integer mdMmId;

    public Integer getMdId() {
        return mdId;
    }

    public void setMdId(Integer mdId) {
        this.mdId = mdId;
    }

    public String getMdName() {
        return mdName;
    }

    public void setMdName(String mdName) {
        this.mdName = mdName == null ? null : mdName.trim();
    }

    public String getMdUrl() {
        return mdUrl;
    }

    public void setMdUrl(String mdUrl) {
        this.mdUrl = mdUrl == null ? null : mdUrl.trim();
    }

    public Integer getMdThId() {
        return mdThId;
    }

    public void setMdThId(Integer mdThId) {
        this.mdThId = mdThId;
    }

    public String getMdInfo() {
        return mdInfo;
    }

    public void setMdInfo(String mdInfo) {
        this.mdInfo = mdInfo == null ? null : mdInfo.trim();
    }

    public Integer getMdType() {
        return mdType;
    }

    public void setMdType(Integer mdType) {
        this.mdType = mdType;
    }

    public Double getMdPrice() {
        return mdPrice;
    }

    public void setMdPrice(Double mdPrice) {
        this.mdPrice = mdPrice;
    }

    public Integer getMdNum() {
        return mdNum;
    }

    public void setMdNum(Integer mdNum) {
        this.mdNum = mdNum;
    }

    public Integer getMdMmId() {
        return mdMmId;
    }

    public void setMdMmId(Integer mdMmId) {
        this.mdMmId = mdMmId;
    }
}
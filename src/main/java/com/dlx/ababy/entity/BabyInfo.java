package com.dlx.ababy.entity;

import java.util.Date;

public class BabyInfo {
    private Integer biId;

    private String biInfo;

    private Integer biWeight;

    private Integer biHinght;

    private Date biDate;

    public Integer getBiId() {
        return biId;
    }

    public void setBiId(Integer biId) {
        this.biId = biId;
    }

    public String getBiInfo() {
        return biInfo;
    }

    public void setBiInfo(String biInfo) {
        this.biInfo = biInfo == null ? null : biInfo.trim();
    }

    public Integer getBiWeight() {
        return biWeight;
    }

    public void setBiWeight(Integer biWeight) {
        this.biWeight = biWeight;
    }

    public Integer getBiHinght() {
        return biHinght;
    }

    public void setBiHinght(Integer biHinght) {
        this.biHinght = biHinght;
    }

    public Date getBiDate() {
        return biDate;
    }

    public void setBiDate(Date biDate) {
        this.biDate = biDate;
    }
}
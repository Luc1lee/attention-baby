package com.dlx.ababy.entity;

public class Area {
    private Integer arId;

    private String arName;

    public Integer getArId() {
        return arId;
    }

    public void setArId(Integer arId) {
        this.arId = arId;
    }

    public String getArName() {
        return arName;
    }

    public void setArName(String arName) {
        this.arName = arName == null ? null : arName.trim();
    }
}
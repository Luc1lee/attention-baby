package com.dlx.ababy.entity;

public class Area {
    private Integer arId;

    private String arName;

    private Integer arCtId;

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

    public Integer getArCtId() {
        return arCtId;
    }

    public void setArCtId(Integer arCtId) {
        this.arCtId = arCtId;
    }
}
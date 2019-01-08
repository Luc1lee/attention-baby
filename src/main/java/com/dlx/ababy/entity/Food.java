package com.dlx.ababy.entity;

public class Food {
    private Integer fdId;

    private String fdName;

    private String fdInfo;

    private Integer fdType;

    private String fdCook;

    public Integer getFdId() {
        return fdId;
    }

    public void setFdId(Integer fdId) {
        this.fdId = fdId;
    }

    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName == null ? null : fdName.trim();
    }

    public String getFdInfo() {
        return fdInfo;
    }

    public void setFdInfo(String fdInfo) {
        this.fdInfo = fdInfo == null ? null : fdInfo.trim();
    }

    public Integer getFdType() {
        return fdType;
    }

    public void setFdType(Integer fdType) {
        this.fdType = fdType;
    }

    public String getFdCook() {
        return fdCook;
    }

    public void setFdCook(String fdCook) {
        this.fdCook = fdCook == null ? null : fdCook.trim();
    }
}
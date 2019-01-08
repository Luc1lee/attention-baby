package com.dlx.ababy.entity;

public class Opinion {
    private Integer opId;

    private Integer uId;

    private String opInfo;

    private String opTel;

    public Integer getOpId() {
        return opId;
    }

    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getOpInfo() {
        return opInfo;
    }

    public void setOpInfo(String opInfo) {
        this.opInfo = opInfo == null ? null : opInfo.trim();
    }

    public String getOpTel() {
        return opTel;
    }

    public void setOpTel(String opTel) {
        this.opTel = opTel == null ? null : opTel.trim();
    }
}
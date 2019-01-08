package com.dlx.ababy.entity;

import java.util.Date;

public class Community {
    private Integer comId;

    private Integer uId;

    private Date comDate;

    private String comInfo;

    private Integer comLikenum;

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Date getComDate() {
        return comDate;
    }

    public void setComDate(Date comDate) {
        this.comDate = comDate;
    }

    public String getComInfo() {
        return comInfo;
    }

    public void setComInfo(String comInfo) {
        this.comInfo = comInfo == null ? null : comInfo.trim();
    }

    public Integer getComLikenum() {
        return comLikenum;
    }

    public void setComLikenum(Integer comLikenum) {
        this.comLikenum = comLikenum;
    }
}
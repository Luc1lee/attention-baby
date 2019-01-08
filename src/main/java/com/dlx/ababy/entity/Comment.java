package com.dlx.ababy.entity;

import java.util.Date;

public class Comment {
    private Integer cmtId;

    private String cmtInfo;

    private Integer cmtUId;

    private Date cmtDate;

    private Integer cmtParentId;

    private Integer cmtLikenum;

    public Integer getCmtId() {
        return cmtId;
    }

    public void setCmtId(Integer cmtId) {
        this.cmtId = cmtId;
    }

    public String getCmtInfo() {
        return cmtInfo;
    }

    public void setCmtInfo(String cmtInfo) {
        this.cmtInfo = cmtInfo == null ? null : cmtInfo.trim();
    }

    public Integer getCmtUId() {
        return cmtUId;
    }

    public void setCmtUId(Integer cmtUId) {
        this.cmtUId = cmtUId;
    }

    public Date getCmtDate() {
        return cmtDate;
    }

    public void setCmtDate(Date cmtDate) {
        this.cmtDate = cmtDate;
    }

    public Integer getCmtParentId() {
        return cmtParentId;
    }

    public void setCmtParentId(Integer cmtParentId) {
        this.cmtParentId = cmtParentId;
    }

    public Integer getCmtLikenum() {
        return cmtLikenum;
    }

    public void setCmtLikenum(Integer cmtLikenum) {
        this.cmtLikenum = cmtLikenum;
    }
}
package com.dlx.ababy.vo;

import java.util.Date;
import java.util.List;

public class CommentVo {

    private Integer cmtId;
    private String cmtInfo;
    private String name;
    private Date cmtDate;
    private Integer cmtComId;
    private Integer cmtLikenum;
    private List<ReplyCommentVo> list;

    public Integer getCmtLikenum() {
        return cmtLikenum;
    }

    public void setCmtLikenum(Integer cmtLikenum) {
        this.cmtLikenum = cmtLikenum;
    }


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
        this.cmtInfo = cmtInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCmtDate() {
        return cmtDate;
    }

    public void setCmtDate(Date cmtDate) {
        this.cmtDate = cmtDate;
    }

    public Integer getCmtComId() {
        return cmtComId;
    }

    public void setCmtComId(Integer cmtComId) {
        this.cmtComId = cmtComId;
    }

    public List<ReplyCommentVo> getList() {
        return list;
    }

    public void setList(List<ReplyCommentVo> list) {
        this.list = list;
    }


}

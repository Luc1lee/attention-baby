package com.dlx.ababy.vo;

import java.util.Date;

public class ReplyCommentVo {

    private Integer replyCmtId;
    private String replyCmtInfo;
    private String replyName;
    private Date replyCmtDate;
    private Integer replyCmtLikenum;
    private Integer replyCmtParentId;

    public Integer getReplyCmtId() {
        return replyCmtId;
    }

    public void setReplyCmtId(Integer replyCmtId) {
        this.replyCmtId = replyCmtId;
    }

    public String getReplyCmtInfo() {
        return replyCmtInfo;
    }

    public void setReplyCmtInfo(String replyCmtInfo) {
        this.replyCmtInfo = replyCmtInfo;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    public Date getReplyCmtDate() {
        return replyCmtDate;
    }

    public void setReplyCmtDate(Date replyCmtDate) {
        this.replyCmtDate = replyCmtDate;
    }

    public Integer getReplyCmtLikenum() {
        return replyCmtLikenum;
    }

    public void setReplyCmtLikenum(Integer replyCmtLikenum) {
        this.replyCmtLikenum = replyCmtLikenum;
    }

    public Integer getReplyCmtParentId() {
        return replyCmtParentId;
    }

    public void setReplyCmtParentId(Integer replyCmtParentId) {
        this.replyCmtParentId = replyCmtParentId;
    }
}

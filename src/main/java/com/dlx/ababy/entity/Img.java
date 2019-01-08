package com.dlx.ababy.entity;

public class Img {
    private Integer imgId;

    private String imgUrl;

    private Integer imgComId;

    private Integer imgCmtId;

    private Integer imgMdId;

    private Integer imgFdId;

    private Integer imgOpId;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Integer getImgComId() {
        return imgComId;
    }

    public void setImgComId(Integer imgComId) {
        this.imgComId = imgComId;
    }

    public Integer getImgCmtId() {
        return imgCmtId;
    }

    public void setImgCmtId(Integer imgCmtId) {
        this.imgCmtId = imgCmtId;
    }

    public Integer getImgMdId() {
        return imgMdId;
    }

    public void setImgMdId(Integer imgMdId) {
        this.imgMdId = imgMdId;
    }

    public Integer getImgFdId() {
        return imgFdId;
    }

    public void setImgFdId(Integer imgFdId) {
        this.imgFdId = imgFdId;
    }

    public Integer getImgOpId() {
        return imgOpId;
    }

    public void setImgOpId(Integer imgOpId) {
        this.imgOpId = imgOpId;
    }
}
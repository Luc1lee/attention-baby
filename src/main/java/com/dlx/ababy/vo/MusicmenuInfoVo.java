package com.dlx.ababy.vo;

public class MusicmenuInfoVo {
    private Integer mmId;

    private Integer mmUId;

    private String mmName;

    private String imgUrl;

    private Integer mdType;

    public Integer getMmId() {
        return mmId;
    }

    public void setMmId(Integer mmId) {
        this.mmId = mmId;
    }

    public Integer getMmUId() {
        return mmUId;
    }

    public void setMmUId(Integer mmUId) {
        this.mmUId = mmUId;
    }

    public String getMmName() {
        return mmName;
    }

    public void setMmName(String mmName) {
        this.mmName = mmName == null ? null : mmName.trim();
    }

    public String getImgUrl() { return imgUrl; }

    public void setImgUrl(String imgUrl) { this.imgUrl = imgUrl; }

    public Integer getMdType() { return mdType; }

    public void setMdType(Integer mdType) { this.mdType = mdType; }
}
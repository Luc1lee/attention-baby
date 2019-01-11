package com.dlx.ababy.vo;

import java.util.List;

public class FoodVo {
    private Integer fdId;

    private String fdName;

    private String fdInfo;

    private Integer fdType;

    private String fdCook;

    private List<String> imgUrl;

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
        this.fdName = fdName;
    }

    public String getFdInfo() {
        return fdInfo;
    }

    public void setFdInfo(String fdInfo) {
        this.fdInfo = fdInfo;
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
        this.fdCook = fdCook;
    }

    public List<String> getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(List<String> imgUrl) {
        this.imgUrl = imgUrl;
    }
}

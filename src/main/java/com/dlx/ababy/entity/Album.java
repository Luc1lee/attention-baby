package com.dlx.ababy.entity;

public class Album {
    private Integer alId;

    private Integer uId;

    private Integer alFlag;

    private Double alPrice;

    private Integer alNum;

    private String alInfo;

    private String alImg;

    private String alIntro;

    public Integer getAlId() {
        return alId;
    }

    public void setAlId(Integer alId) {
        this.alId = alId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getAlFlag() {
        return alFlag;
    }

    public void setAlFlag(Integer alFlag) {
        this.alFlag = alFlag;
    }

    public Double getAlPrice() {
        return alPrice;
    }

    public void setAlPrice(Double alPrice) {
        this.alPrice = alPrice;
    }

    public Integer getAlNum() {
        return alNum;
    }

    public void setAlNum(Integer alNum) {
        this.alNum = alNum;
    }

    public String getAlInfo() {
        return alInfo;
    }

    public void setAlInfo(String alInfo) {
        this.alInfo = alInfo == null ? null : alInfo.trim();
    }

    public String getAlImg() {
        return alImg;
    }

    public void setAlImg(String alImg) {
        this.alImg = alImg == null ? null : alImg.trim();
    }

    public String getAlIntro() {
        return alIntro;
    }

    public void setAlIntro(String alIntro) {
        this.alIntro = alIntro == null ? null : alIntro.trim();
    }
}
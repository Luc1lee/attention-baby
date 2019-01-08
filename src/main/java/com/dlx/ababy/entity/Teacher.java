package com.dlx.ababy.entity;

public class Teacher {
    private Integer thId;

    private String thName;

    private String thPhoto;

    public Integer getThId() {
        return thId;
    }

    public void setThId(Integer thId) {
        this.thId = thId;
    }

    public String getThName() {
        return thName;
    }

    public void setThName(String thName) {
        this.thName = thName == null ? null : thName.trim();
    }

    public String getThPhoto() {
        return thPhoto;
    }

    public void setThPhoto(String thPhoto) {
        this.thPhoto = thPhoto == null ? null : thPhoto.trim();
    }
}
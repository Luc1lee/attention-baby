package com.dlx.ababy.entity;

import java.util.Date;

public class Baby {
    private Integer bId;

    private String babyName;

    private Integer babySex;

    private Date babyBirthday;

    private Date babyDuedate;

    private String babyPhoto;

    private Integer babyUId;

    private Integer babyRelation;

    public Integer getBabyRelation() {
        return babyRelation;
    }

    public void setBabyRelation(Integer babyRelation) {
        this.babyRelation = babyRelation;
    }

    public Integer getBId() {
        return bId;
    }

    public void setBId(Integer bId) {
        this.bId = bId;
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName == null ? null : babyName.trim();
    }

    public Integer getBabySex() {
        return babySex;
    }

    public void setBabySex(Integer babySex) {
        this.babySex = babySex;
    }

    public Date getBabyBirthday() {
        return babyBirthday;
    }

    public void setBabyBirthday(Date babyBirthday) {
        this.babyBirthday = babyBirthday;
    }

    public Date getBabyDuedate() {
        return babyDuedate;
    }

    public void setBabyDuedate(Date babyDuedate) {
        this.babyDuedate = babyDuedate;
    }

    public String getBabyPhoto() {
        return babyPhoto;
    }

    public void setBabyPhoto(String babyPhoto) {
        this.babyPhoto = babyPhoto == null ? null : babyPhoto.trim();
    }

    public Integer getbabyUId() {
        return babyUId;
    }

    public void setbabyUId(Integer babyUId) {
        this.babyUId = babyUId;
    }
}
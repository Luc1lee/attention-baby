package com.dlx.ababy.entity;

import java.util.Date;

public class Baby {
    private Integer bId;

    private String babyName;

    private Integer babySex;

    private Date babyBirthday;

    private Date babyDuedate;

    private String babyPhoto;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
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
}
package com.dlx.ababy.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private String tel;

    private Integer sex;

    private String photo;

    private Integer level;

    private Long integral;

    private Date sviptime;

    private Integer wbtype;

    private Integer uType;

    private Integer uTicket;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getIntegral() {
        return integral;
    }

    public void setIntegral(Long integral) {
        this.integral = integral;
    }

    public Date getSviptime() {
        return sviptime;
    }

    public void setSviptime(Date sviptime) {
        this.sviptime = sviptime;
    }

    public Integer getWbtype() {
        return wbtype;
    }

    public void setWbtype(Integer wbtype) {
        this.wbtype = wbtype;
    }

    public Integer getuType() {
        return uType;
    }

    public void setuType(Integer uType) {
        this.uType = uType;
    }

    public Integer getuTicket() {
        return uTicket;
    }

    public void setuTicket(Integer uTicket) {
        this.uTicket = uTicket;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}
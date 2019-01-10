package com.dlx.ababy.vo;

import java.util.Date;
import java.util.List;

public class CommunityShowVo {
    private Integer id;
    private String name;
    private String photo;
    private List<String> imgUrl;
    private Integer comId;
    private Date comDate;
    private String comInfo;
    private Integer comLikenum;
    private Integer comComtyId;

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
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<String> getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(List<String> imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Date getComDate() {
        return comDate;
    }

    public void setComDate(Date comDate) {
        this.comDate = comDate;
    }

    public String getComInfo() {
        return comInfo;
    }

    public void setComInfo(String comInfo) {
        this.comInfo = comInfo;
    }

    public Integer getComLikenum() {
        return comLikenum;
    }

    public void setComLikenum(Integer comLikenum) {
        this.comLikenum = comLikenum;
    }

    public Integer getComComtyId() {
        return comComtyId;
    }

    public void setComComtyId(Integer comComtyId) {
        this.comComtyId = comComtyId;
    }
}

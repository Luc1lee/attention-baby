package com.dlx.ababy.vo;

import java.util.Date;
import java.util.List;

public class CommunityVo {
    private Integer comId;

    private Integer uId;

    private Date comDate;

    private String comInfo;

    private Integer comLikenum;

    private Integer comComtyId;

    private List<String> imgUrl;

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
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

    public List<String> getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(List<String> imgUrl) {
        this.imgUrl = imgUrl;
    }
}

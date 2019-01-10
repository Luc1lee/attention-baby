package com.dlx.ababy.service;

import com.dlx.ababy.entity.Community;
import com.dlx.ababy.vo.CommunityShowVo;
import com.dlx.ababy.vo.CommunityVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;

import java.util.List;

public interface CommunityService {

    ResultVo save(Community co);

    PageBeanVo<CommunityShowVo> queryCommByComtId(Integer id,int page,int limit);

    PageBeanVo<CommunityShowVo> queryCommByLikeNum(int page, int limit);

    ResultVo delete(int id);

    Community selectById(int id);

    Community selectByInfo(String info);
}

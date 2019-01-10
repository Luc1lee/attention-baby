package com.dlx.ababy.service;

import com.dlx.ababy.entity.Attention;
import com.dlx.ababy.vo.AttentionVo;
import com.dlx.ababy.vo.CommunityShowVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;


public interface AttentionService {
    ResultVo delete(int Uid,int Bid);
    ResultVo save(Attention at);
    ResultVo queryAll();
    PageBeanVo<AttentionVo> queryAllByPage(int page,int limit);
    PageBeanVo<CommunityShowVo> queryAllByUid(int Uid,int page,int limit);
}

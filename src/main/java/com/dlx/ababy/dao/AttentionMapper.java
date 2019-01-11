package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Attention;
import com.dlx.ababy.vo.AttentionVo;
import com.dlx.ababy.vo.CommunityShowVo;

import java.util.List;
import java.util.Map;

public interface AttentionMapper {
    int deleteByUid(Map<String,Object> param);

    int insert(Attention record);

    List<AttentionVo> selectAllAttn();

    int selectcount();

    List<AttentionVo> selectByPage(Map<String,Object> param);

    List<CommunityShowVo> selectByUid(Map<String,Object> param);
}
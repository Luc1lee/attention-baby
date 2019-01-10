package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Attention;

import java.util.List;
import java.util.Map;

public interface AttentionMapper {
    int deleteByUid(Map<String,Object> param);

    int insert(Attention record);

    List<Attention> selectAllAttn();

    int selectcount();

    List<Attention> selectByPage(Map<String,Object> param);

    List<Attention> selectByUid(Integer id,Map<String,Object> param);
}
package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Attention;

public interface AttentionMapper {
    int deleteByPrimaryKey(Integer atId);

    int insert(Attention record);

    int insertSelective(Attention record);

    Attention selectByPrimaryKey(Integer atId);

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);
}
package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Baby;

public interface BabyMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(Baby record);

    int insertSelective(Baby record);

    Baby selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Baby record);

    int updateByPrimaryKey(Baby record);
}
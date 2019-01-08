package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Baby;

import java.util.List;

public interface BabyMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(Baby record);

    int insertSelective(Baby record);

    Baby selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Baby record);

    int updateByPrimaryKey(Baby record);

    List<Baby> selectByUId(Integer babyUId);
}
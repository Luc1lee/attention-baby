package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Like;

public interface LikeMapper {
    int deleteByPrimaryKey(Integer lkId);

    int insert(Like record);

    int insertSelective(Like record);

    Like selectByPrimaryKey(Integer lkId);

    int updateByPrimaryKeySelective(Like record);

    int updateByPrimaryKey(Like record);
}
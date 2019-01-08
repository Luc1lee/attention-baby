package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Community;

public interface CommunityMapper {
    int deleteByPrimaryKey(Integer comId);

    int insert(Community record);

    int insertSelective(Community record);

    Community selectByPrimaryKey(Integer comId);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);
}
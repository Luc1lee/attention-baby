package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Community;

import java.util.List;

public interface CommunityMapper {
    int deleteByPrimaryKey(Integer comId);

    int insert(Community record);

    int insertSelective(Community record);

    Community selectByPrimaryKey(Integer comId);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);

    List<Community> selectByComtId(Integer id);

    List<Community> selectByLikeNum();

    Community selectByInfo(String info);

    List<Community> findCollectionByMcUId(Integer mcUId);
}
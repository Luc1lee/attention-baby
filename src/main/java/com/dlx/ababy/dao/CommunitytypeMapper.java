package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Communitytype;

import java.util.List;

public interface CommunitytypeMapper {
    int deleteByPrimaryKey(Integer comtyId);

    int insert(Communitytype record);

    int insertSelective(Communitytype record);

    Communitytype selectByPrimaryKey(Integer comtyId);

    int updateByPrimaryKeySelective(Communitytype record);

    int updateByPrimaryKey(Communitytype record);

    List<Communitytype> selectAllType();


}
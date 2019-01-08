package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Mycollection;

import java.util.List;

public interface MycollectionMapper {
    int deleteByPrimaryKey(Integer mcId);

    int insert(Mycollection record);

    int insertSelective(Mycollection record);

    Mycollection selectByPrimaryKey(Integer mcId);

    int updateByPrimaryKeySelective(Mycollection record);

    int updateByPrimaryKey(Mycollection record);

}
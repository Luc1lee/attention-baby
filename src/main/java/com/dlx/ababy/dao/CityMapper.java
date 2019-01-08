package com.dlx.ababy.dao;

import com.dlx.ababy.entity.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer ctId);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer ctId);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}
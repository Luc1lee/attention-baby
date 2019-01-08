package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Food;

public interface FoodMapper {
    int deleteByPrimaryKey(Integer fdId);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Integer fdId);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);
}
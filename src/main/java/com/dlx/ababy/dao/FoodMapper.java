package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Food;
import com.dlx.ababy.vo.FoodVo;

import java.util.List;
import java.util.Map;

public interface FoodMapper {
    int deleteByPrimaryKey(Integer fdId);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Integer fdId);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);

    Food selectByName(String name);
    int selectcount();

    List<FoodVo> selectByPage(Map<String,Object> param);

    List<FoodVo> selectByCondition(String str);

    List<Food> findCollectionByMcUId(Integer mcUId);
}
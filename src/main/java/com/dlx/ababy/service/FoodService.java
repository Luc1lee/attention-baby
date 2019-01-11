package com.dlx.ababy.service;

import com.dlx.ababy.entity.Food;
import com.dlx.ababy.vo.FoodVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;

import java.util.List;
import java.util.Map;

public interface FoodService {
    ResultVo save(Food food);

    Food selectByName(String name);

    PageBeanVo queryAllFood(int page, int limit);

    List<FoodVo> queryByCondition(Map<String, Object> infos);

    List<FoodVo> queryByType(int id);
}

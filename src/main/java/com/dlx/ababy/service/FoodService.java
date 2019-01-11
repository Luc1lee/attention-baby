package com.dlx.ababy.service;

import com.dlx.ababy.entity.Food;
import com.dlx.ababy.vo.FoodVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;

public interface FoodService {
    ResultVo save(Food food);

    Food selectByName(String name);

    PageBeanVo queryAllFood(int page, int limit);

    ResultVo queryByCondition(String str);
}

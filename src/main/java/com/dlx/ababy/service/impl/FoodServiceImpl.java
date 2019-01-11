package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.FoodMapper;
import com.dlx.ababy.entity.Food;
import com.dlx.ababy.service.FoodService;
import com.dlx.ababy.vo.FoodVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodMapper fDao;
    @Override
    public ResultVo save(Food food) {
        if (fDao.insert(food) >0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }

    @Override
    public Food selectByName(String name) {
        return fDao.selectByName(name);
    }

    @Override
    public PageBeanVo<FoodVo> queryAllFood(int page, int limit) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("index", (page - 1) * limit);
        map.put("limit", limit);
        return PageBeanVo.setPage(fDao.selectcount(),fDao.selectByPage(map));
    }

    @Override
    public ResultVo queryByCondition(String str) {
        return ResultVo.setOK(fDao.selectByCondition(str));
    }

}

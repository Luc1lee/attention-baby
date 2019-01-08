package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.CityMapper;
import com.dlx.ababy.entity.City;
import com.dlx.ababy.service.CityService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cm;

    @Override
    public ResultVo selectAll() {
        List<City> list = cm.selectAll();
        return ResultVo.setOK(list);
    }
}

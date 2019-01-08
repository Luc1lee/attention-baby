package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.AreaMapper;
import com.dlx.ababy.entity.Area;
import com.dlx.ababy.service.AreaService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper am;

    @Override
    public ResultVo selectByCtId(Integer arCtId) {
        List<Area> list = am.selectByCtId(arCtId);

        return ResultVo.setOK(list);
    }
}

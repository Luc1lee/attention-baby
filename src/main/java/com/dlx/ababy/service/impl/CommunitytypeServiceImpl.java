package com.dlx.ababy.service.impl;


import com.dlx.ababy.dao.CommunitytypeMapper;
import com.dlx.ababy.entity.Communitytype;
import com.dlx.ababy.service.CommunitytypeService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunitytypeServiceImpl implements CommunitytypeService {
    @Autowired
    private CommunitytypeMapper comDao;
    @Override
    public ResultVo queryAllType() {
        return ResultVo.setOK(comDao.selectAllType());
    }

    @Override
    public ResultVo saveType(Communitytype co) {
        if (comDao.insert(co) > 0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }
}

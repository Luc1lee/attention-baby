package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.MylessonsMapper;
import com.dlx.ababy.service.MylessonsService;
import com.dlx.ababy.vo.MylessonsResultVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MylessonsServiceImpl implements MylessonsService {

    @Autowired
    private MylessonsMapper mylessonsMapper;

    @Override
    public ResultVo findMyLessons(Integer id) {

        MylessonsResultVo resultVo = mylessonsMapper.selectByUserPrimaryKey(id);

        return ResultVo.setOK(resultVo);
    }
}

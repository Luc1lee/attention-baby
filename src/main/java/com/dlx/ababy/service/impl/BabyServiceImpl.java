package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.BabyMapper;
import com.dlx.ababy.entity.Baby;
import com.dlx.ababy.service.BabyService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BabyServiceImpl implements BabyService {

    @Autowired
    private BabyMapper bm;


    @Override
    public ResultVo addBaby(Baby baby) {
        if (baby == null || baby.equals("")){
            return ResultVo.setERROR();
        } else {
            bm.insert(baby);
            return ResultVo.setOK(null);
        }

    }

    @Override
    public ResultVo updateBaby(Baby baby) {
        bm.updateByPrimaryKeySelective(baby);
        return ResultVo.setOK(null);
    }

    @Override
    public ResultVo selectByUId(Integer babyUId) {
        List<Baby> list = bm.selectByUId(babyUId);

        return ResultVo.setOK(list);
    }
}

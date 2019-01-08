package com.dlx.ababy.service.impl;


import com.dlx.ababy.dao.BabyInfoMapper;
import com.dlx.ababy.entity.BabyInfo;
import com.dlx.ababy.service.BabyInfoService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BabyInfoServiceImpl implements BabyInfoService {

    @Autowired
    private BabyInfoMapper bim;

    @Override
    public ResultVo addBabyInfo(BabyInfo babyInfo) {

        if (babyInfo == null || babyInfo.equals("")) {
            return  ResultVo.setERROR();
        } else {
            bim.insert(babyInfo);
            return ResultVo.setOK(null);
        }

    }

    @Override
    public ResultVo findByBId(Integer biBId) {
        List<BabyInfo> list = bim.findByBId(biBId);

        return ResultVo.setOK(list);
    }
}

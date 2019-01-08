package com.dlx.ababy.service;

import com.dlx.ababy.entity.BabyInfo;
import com.qfedu.vo.ResultVo;

public interface BabyInfoService {

    ResultVo addBabyInfo(BabyInfo babyInfo);

    ResultVo findByBId(Integer biBId);
}

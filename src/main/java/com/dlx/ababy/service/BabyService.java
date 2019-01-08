package com.dlx.ababy.service;

import com.dlx.ababy.entity.Baby;
import com.qfedu.vo.ResultVo;

public interface BabyService {

    ResultVo addBaby(Baby baby);

    ResultVo updateBaby(Baby baby);

    ResultVo selectByUId(Integer babyUId);
}

package com.dlx.ababy.service;

import com.dlx.ababy.entity.Communitytype;
import com.qfedu.vo.ResultVo;

public interface CommunitytypeService {
    ResultVo queryAllType();

    ResultVo saveType(Communitytype co);
}

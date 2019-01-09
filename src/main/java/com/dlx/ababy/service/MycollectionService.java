package com.dlx.ababy.service;

import com.dlx.ababy.entity.Mycollection;
import com.qfedu.vo.ResultVo;

public interface  MycollectionService {

    ResultVo add(Mycollection mycollection);

    ResultVo delete(Integer mcId);

    ResultVo selectByType(Integer type, Integer mcUId);
}

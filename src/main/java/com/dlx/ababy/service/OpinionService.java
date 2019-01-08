package com.dlx.ababy.service;

import com.dlx.ababy.entity.Opinion;
import com.qfedu.vo.ResultVo;

public interface OpinionService {

    ResultVo addOpinion(Opinion opinion, String imgUrl);
}

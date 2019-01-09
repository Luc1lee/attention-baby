package com.dlx.ababy.service;

import com.dlx.ababy.entity.Community;
import com.qfedu.vo.ResultVo;

import java.util.List;

public interface CommunityService {

    ResultVo save(Community co);

    ResultVo queryCommByComtId(Integer id);

    ResultVo queryCommByLikeNum();

    ResultVo delete(int id);

}

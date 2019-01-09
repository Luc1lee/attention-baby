package com.dlx.ababy.service;

import com.dlx.ababy.entity.Like;
import com.qfedu.vo.ResultVo;

public interface LikeService {

    ResultVo addLike(Like like);

    ResultVo deleteLike(Like like);
}

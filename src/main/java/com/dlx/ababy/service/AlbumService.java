package com.dlx.ababy.service;

import com.dlx.ababy.entity.Album;
import com.qfedu.vo.ResultVo;

public interface AlbumService {

    ResultVo queryAlbumDetail();

//    ResultVo modifyAlbumStatus(Integer uid,Integer Status);

    ResultVo queryAlbumByUid(Integer uid);

    ResultVo buyAlbumByUid(Album album);

}

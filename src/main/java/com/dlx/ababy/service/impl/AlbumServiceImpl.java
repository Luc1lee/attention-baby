package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.AlbumMapper;
import com.dlx.ababy.entity.Album;
import com.dlx.ababy.service.AlbumService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.lang.Thread.sleep;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public ResultVo queryAlbumDetail() {

        Album album = albumMapper.selectByPrimaryKey(1);

        return ResultVo.setOK(album);
    }

    /*@Override
    public ResultVo modifyAlbumStatus(Integer uid,Integer Status) {

        albumMapper.selectByPrimaryKey(uid);

        return null;
    }*/

    @Override
    public ResultVo queryAlbumByUid(Integer uid) {

        Album album = albumMapper.selectByUid(uid);

        return ResultVo.setOK(album);
    }

    @Override
    public ResultVo buyAlbumByUid(Album album) {

        ResultVo vo = null;

        try {
            albumMapper.insertSelective(album);
            vo.setMsg("OK");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                sleep(3000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            vo.setMsg("网络波动较大，订单创建失败");
        }

        return vo;
    }
}

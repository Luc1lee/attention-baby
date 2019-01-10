package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.PhotosMapper;
import com.dlx.ababy.entity.Photos;
import com.dlx.ababy.service.PhotosService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotosServiceImpl implements PhotosService {
    @Autowired
    private PhotosMapper phDao;
    @Override
    public ResultVo savePhotos(Photos ph) {
        if (phDao.insert(ph) > 0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }
}

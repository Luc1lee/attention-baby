package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.ImgMapper;
import com.dlx.ababy.entity.Img;
import com.dlx.ababy.service.ImgService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImgServiceImpl implements ImgService {
    @Autowired
    private ImgMapper imgDao;
    @Override
    public ResultVo save(Img img) {
        if (imgDao.insert(img) > 0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }
}

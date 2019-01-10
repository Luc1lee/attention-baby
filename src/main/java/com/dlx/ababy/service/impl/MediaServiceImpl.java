package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.MediaMapper;
import com.dlx.ababy.entity.Media;
import com.dlx.ababy.service.MediaService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaServiceImpl implements MediaService {

    @Autowired
    private MediaMapper mediaMapper;

    @Override
    public ResultVo queryMusicMenu(Integer mdType, Integer mdMmId) {

        List<Media> mediaList = mediaMapper.selectBymdType(mdType, mdMmId);

        return ResultVo.setOK(mediaList);
    }
}

package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.MusicmenuMapper;
import com.dlx.ababy.service.MusicmenuService;
import com.dlx.ababy.vo.MusicmenuInfoVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicmenuServiceImpl implements MusicmenuService {

    @Autowired
    private MusicmenuMapper musicmenuMapper;

    @Override
    public ResultVo queryMusicMenuInfo(Integer mmid) {

        MusicmenuInfoVo infoVo = musicmenuMapper.selectInfoByPrimaryKey(mmid);

        return ResultVo.setOK(infoVo);
    }

    @Override
    public ResultVo queryMusicMenuList(Integer mdType) {

        List<MusicmenuInfoVo> list = musicmenuMapper.selectInfoByMdType(mdType);

        return ResultVo.setOK(list);
    }
}

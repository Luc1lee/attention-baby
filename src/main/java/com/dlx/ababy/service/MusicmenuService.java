package com.dlx.ababy.service;

import com.qfedu.vo.ResultVo;

public interface MusicmenuService {

    ResultVo queryMusicMenuInfo(Integer mmid);

    ResultVo queryMusicMenuList(Integer mdType);

}

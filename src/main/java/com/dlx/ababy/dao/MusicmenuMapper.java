package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Musicmenu;
import com.dlx.ababy.vo.MusicmenuInfoVo;

import java.util.List;

public interface MusicmenuMapper {
    int deleteByPrimaryKey(Integer mmId);

    int insert(Musicmenu record);

    int insertSelective(Musicmenu record);

    Musicmenu selectByPrimaryKey(Integer mmId);

    int updateByPrimaryKeySelective(Musicmenu record);

    int updateByPrimaryKey(Musicmenu record);

    MusicmenuInfoVo selectInfoByPrimaryKey(Integer mmId);

    List<MusicmenuInfoVo> selectInfoByMdType(Integer mdType);
}
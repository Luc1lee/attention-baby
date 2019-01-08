package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Album;

public interface AlbumMapper {
    int deleteByPrimaryKey(Integer alId);

    int insert(Album record);

    int insertSelective(Album record);

    Album selectByPrimaryKey(Integer alId);

    int updateByPrimaryKeySelective(Album record);

    int updateByPrimaryKey(Album record);
}
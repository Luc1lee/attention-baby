package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Media;

public interface MediaMapper {
    int deleteByPrimaryKey(Integer mdId);

    int insert(Media record);

    int insertSelective(Media record);

    Media selectByPrimaryKey(Integer mdId);

    int updateByPrimaryKeySelective(Media record);

    int updateByPrimaryKey(Media record);
}
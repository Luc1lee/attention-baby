package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Area;

import java.util.List;

public interface AreaMapper {
    int deleteByPrimaryKey(Integer arId);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer arId);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);

    List<Area> selectByCtId(Integer arCtId);
}
package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Lessons;

public interface LessonsMapper {
    int deleteByPrimaryKey(Integer leId);

    int insert(Lessons record);

    int insertSelective(Lessons record);

    Lessons selectByPrimaryKey(Integer leId);

    int updateByPrimaryKeySelective(Lessons record);

    int updateByPrimaryKey(Lessons record);


}
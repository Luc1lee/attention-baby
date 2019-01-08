package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Opinion;

public interface OpinionMapper {
    int deleteByPrimaryKey(Integer opId);

    int insert(Opinion record);

    int insertSelective(Opinion record);

    Opinion selectByPrimaryKey(Integer opId);

    int updateByPrimaryKeySelective(Opinion record);

    int updateByPrimaryKey(Opinion record);
}
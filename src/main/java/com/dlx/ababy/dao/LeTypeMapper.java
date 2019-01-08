package com.dlx.ababy.dao;

import com.dlx.ababy.entity.LeType;

public interface LeTypeMapper {
    int deleteByPrimaryKey(Integer ltId);

    int insert(LeType record);

    int insertSelective(LeType record);

    LeType selectByPrimaryKey(Integer ltId);

    int updateByPrimaryKeySelective(LeType record);

    int updateByPrimaryKey(LeType record);
}
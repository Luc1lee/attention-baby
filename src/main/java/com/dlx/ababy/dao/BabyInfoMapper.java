package com.dlx.ababy.dao;

import com.dlx.ababy.entity.BabyInfo;

public interface BabyInfoMapper {
    int deleteByPrimaryKey(Integer biId);

    int insert(BabyInfo record);

    int insertSelective(BabyInfo record);

    BabyInfo selectByPrimaryKey(Integer biId);

    int updateByPrimaryKeySelective(BabyInfo record);

    int updateByPrimaryKey(BabyInfo record);
}
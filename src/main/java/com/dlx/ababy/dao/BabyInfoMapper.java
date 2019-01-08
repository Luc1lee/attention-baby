package com.dlx.ababy.dao;

import com.dlx.ababy.entity.BabyInfo;

import java.util.List;

public interface BabyInfoMapper {
    int deleteByPrimaryKey(Integer biId);

    int insert(BabyInfo record);

    int insertSelective(BabyInfo record);

    BabyInfo selectByPrimaryKey(Integer biId);

    int updateByPrimaryKeySelective(BabyInfo record);

    int updateByPrimaryKey(BabyInfo record);

    List<BabyInfo> findByBId(Integer biBId);
}
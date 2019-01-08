package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Photos;

public interface PhotosMapper {
    int deleteByPrimaryKey(Integer ptId);

    int insert(Photos record);

    int insertSelective(Photos record);

    Photos selectByPrimaryKey(Integer ptId);

    int updateByPrimaryKeySelective(Photos record);

    int updateByPrimaryKey(Photos record);
}
package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Mylessons;
import com.dlx.ababy.vo.MylessonsResultVo;

public interface MylessonsMapper {
    int deleteByPrimaryKey(Integer mlId);

    int insert(Mylessons record);

    int insertSelective(Mylessons record);

    Mylessons selectByPrimaryKey(Integer mlId);

    int updateByPrimaryKeySelective(Mylessons record);

    int updateByPrimaryKey(Mylessons record);

    MylessonsResultVo selectByUserPrimaryKey(Integer mlId);
}
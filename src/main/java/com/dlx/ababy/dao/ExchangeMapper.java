package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Exchange;

public interface ExchangeMapper {
    int deleteByPrimaryKey(Integer ecId);

    int insert(Exchange record);

    int insertSelective(Exchange record);

    Exchange selectByPrimaryKey(Integer ecId);

    int updateByPrimaryKeySelective(Exchange record);

    int updateByPrimaryKey(Exchange record);
}
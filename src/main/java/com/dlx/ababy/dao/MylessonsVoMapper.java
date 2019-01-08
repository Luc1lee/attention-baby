package com.dlx.ababy.dao;

import com.dlx.ababy.entity.MylessonsVo;

public interface MylessonsVoMapper {
    int deleteByPrimaryKey(Integer voId);

    int insert(MylessonsVo record);

    int insertSelective(MylessonsVo record);

    MylessonsVo selectByPrimaryKey(Integer voId);

    int updateByPrimaryKeySelective(MylessonsVo record);

    int updateByPrimaryKey(MylessonsVo record);
}
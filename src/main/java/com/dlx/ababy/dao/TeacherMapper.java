package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer thId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer thId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}
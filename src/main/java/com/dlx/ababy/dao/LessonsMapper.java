package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Lessons;
import com.dlx.ababy.vo.LessonsListVo;
import com.dlx.ababy.vo.LessonsResultVo;

import java.util.List;

public interface LessonsMapper {
    int deleteByPrimaryKey(Integer leId);

    int insert(Lessons record);

    int insertSelective(Lessons record);

    Lessons selectByPrimaryKey(Integer leId);

    int updateByPrimaryKeySelective(Lessons record);

    int updateByPrimaryKey(Lessons record);

    LessonsResultVo selectDetailByPrimaryKey(Integer leId);

    List<LessonsListVo> queryLessonsListByLtid(Integer ltid);
}
package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Comment;
import com.dlx.ababy.vo.CommentVo;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer cmtId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer cmtId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<CommentVo> findByComId(Integer cmtComId);
}
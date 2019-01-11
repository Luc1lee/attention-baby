package com.dlx.ababy.dao;

import com.dlx.ababy.entity.Community;
import com.dlx.ababy.vo.CommunityShowVo;

import java.util.List;
import java.util.Map;

public interface CommunityMapper {
    int deleteByPrimaryKey(Integer comId);

    int insert(Community record);

    int insertSelective(Community record);

    Community selectByPrimaryKey(Integer comId);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);

    List<CommunityShowVo> selectByComtId(Integer id, Map<String,Object> param);

    List<CommunityShowVo> selectByLikeNum(Map<String,Object> param);

    Community selectByInfo(String info);

    List<Community> findCollectionByMcUId(Integer mcUId);

    int selectcount();
}
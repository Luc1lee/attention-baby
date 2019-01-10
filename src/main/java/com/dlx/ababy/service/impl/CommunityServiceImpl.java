package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.CommunityMapper;
import com.dlx.ababy.entity.Community;
import com.dlx.ababy.service.CommunityService;
import com.dlx.ababy.vo.CommunityShowVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    private CommunityMapper commDao;
    @Override
    public ResultVo save(Community co) {
        if (commDao.insert(co) >0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }

    @Override
    public PageBeanVo<CommunityShowVo> queryCommByComtId(Integer id,int page,int limit) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("index", (page - 1) * limit);
        map.put("limit", limit);

        return  PageBeanVo.setPage(commDao.selectcount(),commDao.selectByComtId(id,map));
    }

    @Override
    public PageBeanVo<CommunityShowVo> queryCommByLikeNum(int page,int limit) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("index", (page - 1) * limit);
        map.put("limit", limit);
        return PageBeanVo.setPage(commDao.selectcount(),commDao.selectByLikeNum(map));
    }

    @Override
    public ResultVo delete(int id) {
        if (commDao.deleteByPrimaryKey(id) > 0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }

    @Override
    public Community selectById(int id) {
        return commDao.selectByPrimaryKey(id);
    }

    @Override
    public Community selectByInfo(String info) {
        return commDao.selectByInfo(info);
    }
}

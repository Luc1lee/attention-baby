package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.CommunityMapper;
import com.dlx.ababy.entity.Community;
import com.dlx.ababy.service.CommunityService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public ResultVo queryCommByComtId(Integer id) {
        List<Community> list = commDao.selectByComtId(id);
        return ResultVo.setOK(list);
    }

    @Override
    public ResultVo queryCommByLikeNum() {
        List<Community> list = commDao.selectByLikeNum();
        return ResultVo.setOK(list);
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

package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.AttentionMapper;
import com.dlx.ababy.entity.Attention;
import com.dlx.ababy.service.AttentionService;
import com.dlx.ababy.vo.AttentionVo;
import com.dlx.ababy.vo.CommunityShowVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AttentionServiceImpl implements AttentionService {
    @Autowired
    private AttentionMapper atDao;
    @Override
    public ResultVo delete(int Uid, int Bid) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("Uid", Uid);
        map.put("Bid", Bid);
        if (atDao.deleteByUid(map) > 0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }

    @Override
    public ResultVo save(Attention at) {
        if (atDao.insert(at) > 0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }

    @Override
    public ResultVo queryAll() {
        return ResultVo.setOK(atDao.selectAllAttn());
    }

    @Override
    public PageBeanVo<AttentionVo> queryAllByPage(int page,int limit) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("index", (page - 1) * limit);
        map.put("limit", limit);
        return PageBeanVo.setPage(atDao.selectcount(),atDao.selectByPage(map));
    }

    @Override
    public PageBeanVo<CommunityShowVo> queryAllByUid(int Uid,int page,int limit) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("index", (page - 1) * limit);
        map.put("limit", limit);
        return PageBeanVo.setPage(atDao.selectcount(),atDao.selectByUid(Uid,map));
    }
}

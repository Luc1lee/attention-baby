package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.CommunityMapper;
import com.dlx.ababy.dao.FoodMapper;
import com.dlx.ababy.dao.MediaMapper;
import com.dlx.ababy.dao.MycollectionMapper;
import com.dlx.ababy.entity.Community;
import com.dlx.ababy.entity.Food;
import com.dlx.ababy.entity.Media;
import com.dlx.ababy.entity.Mycollection;
import com.dlx.ababy.service.MycollectionService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MycollectionServiceImpl implements MycollectionService {

    @Autowired
    private MycollectionMapper mm;

    @Autowired
    private FoodMapper fm;

    @Autowired
    private MediaMapper mdm;

    @Autowired
    private CommunityMapper cm;

    @Override
    public ResultVo add(Mycollection mycollection) {

        if (mycollection != null && !mycollection.equals("")) {
            Mycollection mycollection1 = mm.findByCondition(mycollection);
            if (mycollection1 == null || mycollection1.equals("")) {
                mm.insert(mycollection);
                return ResultVo.setOK(null);
            } else {
                return ResultVo.setERROR();
            }
        } else {
            return ResultVo.setERROR();
        }

    }

    @Override
    public ResultVo delete(Integer mcId) {

        try {
            mm.deleteByPrimaryKey(mcId);
            return ResultVo.setOK(null);
        } catch (Exception e) {
            return ResultVo.setERROR();
        }

    }

    @Override
    public ResultVo selectByType(Integer type, Integer mcUId) {

        if (type == 0) {
            List<Community> list = cm.findCollectionByMcUId(mcUId);
            return ResultVo.setOK(list);
        } else if (type == 1) {
            List<Food> list = fm.findCollectionByMcUId(mcUId);
            return ResultVo.setOK(list);
        } else if (type == 2) {
            List<Media> list = mdm.findCollectionByMcUId(mcUId);
            return ResultVo.setOK(list);
        } else {
            return ResultVo.setERROR();
        }

    }
}

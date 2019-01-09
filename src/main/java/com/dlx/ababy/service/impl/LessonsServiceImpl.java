package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.LessonsMapper;
import com.dlx.ababy.service.LessonsService;
import com.dlx.ababy.vo.LessonsListVo;
import com.dlx.ababy.vo.LessonsResultVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonsServiceImpl implements LessonsService {

    @Autowired
    private LessonsMapper lessonsMapper;

    @Override
    public ResultVo queryLessonsDetail(Integer id) {

        LessonsResultVo resultVo = lessonsMapper.selectDetailByPrimaryKey(id);
        return ResultVo.setOK(resultVo);

    }

    @Override
    public ResultVo queryLessonsList(Integer ltid) {
        List<LessonsListVo> listVos = lessonsMapper.queryLessonsListByLtid(ltid);
        return ResultVo.setOK(listVos);
    }
}

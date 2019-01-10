package com.dlx.ababy.service;

import com.qfedu.vo.ResultVo;

public interface LessonsService {
    ResultVo queryLessonsDetail(Integer leid);

    ResultVo queryLessonsList(Integer ltid);
}

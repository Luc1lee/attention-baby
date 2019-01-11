package com.dlx.ababy.controller;

import com.dlx.ababy.service.LessonsService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "育宝宝项目",value = "Lessons接口文档")
@RestController
@RequestMapping("/lessons")
@CrossOrigin
public class LessonsController {

    @Autowired
    private LessonsService lessonsService;

    @GetMapping("/detail.do")
    @ApiOperation(notes = "传输课程详情页面所需信息，传给后台leid",value = "获取课程详细信息接口")
    public ResultVo queryLessons(Integer leid) { return lessonsService.queryLessonsDetail(leid); }

    @GetMapping("/list.do")
    @ApiOperation(notes = "传输课程列表页面所需信息，传给后台课程类型ltid，1-早教，2-家教，3-宝健",value = "获取课程列表接口")
    public ResultVo queryLessonsList(Integer ltid) { return lessonsService.queryLessonsList(ltid); }


}

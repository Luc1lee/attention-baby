package com.dlx.ababy.controller;

import com.dlx.ababy.entity.Mycollection;
import com.dlx.ababy.service.MycollectionService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "收藏项目",value = "接口文档")
@RestController
@RequestMapping("/collection")
public class MycollectionController {


    @Autowired
    private MycollectionService ms;

    @ApiOperation(notes = "传收藏信息，进行添加，必须上传客户id（mcUId），不必要：食物id（mcFdId）、社区消息id（mcComId）、音乐id（mcMdId）三者选一",tags = {"mycollection对象"},value = "添加收藏接口")
    @PostMapping("/add.do")
    @CrossOrigin
    public ResultVo add(@ApiParam(value = "mycollection对象")Mycollection mycollection) {
        return ms.add(mycollection);
    }

    @ApiOperation(notes = "传这条收藏的id（mcId）",tags = {"mcId"},value = "取消收藏接口")
    @PostMapping("/del.do")
    @CrossOrigin
    public ResultVo delete(@ApiParam(value = "mcId")int mcId) {
        return ms.delete(mcId);
    }

    @ApiOperation(notes = "传类型和客户id进行收藏查询类型（type 0.社区，1.食物，2.音乐）客户id（mcUID）",tags = {"类型","客户id"},value = "取消收藏接口")
    @PostMapping("/query.do")
    @CrossOrigin
    public ResultVo query(@ApiParam(value = "类型")Integer type,@ApiParam(value = "客户id")Integer mcUId) {
        return ms.selectByType(type,mcUId);
    }
}

package com.dlx.ababy.controller;

import com.dlx.ababy.entity.Opinion;
import com.dlx.ababy.service.OpinionService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "育宝宝项目",value = "opinion接口文档")
@RestController("/opinion")
public class OpinionController {

    @Autowired
    private OpinionService os;

    @ApiOperation(notes = "传baby基本信息，进行添加",tags = {"基本信息","图片路径"},value = "添加baby接口")
    @PostMapping("/add.do")
    @CrossOrigin
    public ResultVo addOpinion(@ApiParam(value = "意见信息")Opinion opinion, @ApiParam(value = "图片路径")String imgUrl){

        return os.addOpinion(opinion, imgUrl);
    }

}

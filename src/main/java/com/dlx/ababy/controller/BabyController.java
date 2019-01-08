package com.dlx.ababy.controller;

import com.dlx.ababy.entity.Baby;
import com.dlx.ababy.service.BabyService;
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

@Api(produces = "育宝宝项目",value = "baby接口文档")
@RestController
@RequestMapping("/baby")
public class BabyController {

    @Autowired
    private BabyService bs;

    @ApiOperation(notes = "传baby基本信息，进行添加",tags = {"基本信息"},value = "添加baby接口")
    @PostMapping("/add.do")
    @CrossOrigin
    public ResultVo addBaby(@ApiParam(value = "baby对象：必要变量babyName,babySex,babyUId,babyRelation【关系0.爸爸，1.妈妈，2.其他】 可选变量babyBirthday,babyDuedate,babyPhoto")Baby baby){
        return bs.addBaby(baby);
    }

    @ApiOperation(notes = "传baby基本信息，进行修改",tags = {"接口信息"},value = "修改baby接口")
    @PostMapping("/update.do")
    @CrossOrigin
    public ResultVo updateBaby(@ApiParam(value = "baby对象：要修改的信息、bId")Baby baby){
        return bs.updateBaby(baby);
    }

    @ApiOperation(notes = "传用户id，进行查询",tags = {"接口信息"},value = "查询用户所有baby接口")
    @PostMapping("/findbyuid.do")
    @CrossOrigin
    public ResultVo findByBId(@ApiParam(value = "用户id（babyUId）")Integer babyUId){
        return bs.selectByUId(babyUId);
    }
}

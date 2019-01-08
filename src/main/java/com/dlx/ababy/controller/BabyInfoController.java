package com.dlx.ababy.controller;

import com.dlx.ababy.entity.BabyInfo;
import com.dlx.ababy.service.BabyInfoService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(produces = "育宝宝项目",value = "baby详细接口文档")
@RestController
@RequestMapping("/babyinfo")
public class BabyInfoController {

    @Autowired
    private BabyInfoService bis;

    @ApiOperation(notes = "传baby详细信息，进行添加",tags = {"基本信息"},value = "添加baby详细信息接口")
    @PostMapping("/add.do")
    @CrossOrigin
    public ResultVo addBabyInfo(BabyInfo babyInfo){
        return bis.addBabyInfo(babyInfo);
    }

    @GetMapping("/findbybid.do")
    @CrossOrigin
    public ResultVo findByBId(Integer biBId){
        return bis.findByBId(biBId);
    }

}

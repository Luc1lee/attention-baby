package com.dlx.ababy.controller;

import com.dlx.ababy.service.MylessonsService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "育宝宝项目",value = "MyLessons接口文档")
@RestController
@RequestMapping("/mylessons")
public class MylessonsController {

    @Autowired
    private MylessonsService mylessonsService;

    @ApiOperation(notes = "传输MyLessons页面所需信息,通过url传给后端一个用户id",tags = "信息属性",value = "获取页面信息接口")
    @GetMapping("/findmylessons.do")
    public ResultVo findMyLessons(@ApiParam(value = "信息") Integer id){
           return mylessonsService.findMyLessons(id);
    }

}

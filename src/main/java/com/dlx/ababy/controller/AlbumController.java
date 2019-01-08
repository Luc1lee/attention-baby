package com.dlx.ababy.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
public class AlbumController {
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"数量","名次"},value = "获取名次接口")
    @GetMapping("/datalist.do")
    public List<String> query1(@ApiParam(value = "数量") int count) {
        List<String> strs=new ArrayList<String>();
        for(int i=1;i<=count;i++){
            strs.add("第"+i+"名");
        }
        return strs;
    }
}

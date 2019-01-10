package com.dlx.ababy.controller;

import com.dlx.ababy.entity.Communitytype;
import com.dlx.ababy.service.CommunitytypeService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
@RequestMapping("communitytype")
public class CommunitytypeController {
    @Autowired
    private CommunitytypeService comService;
    private ResultVo rv;

    @ApiOperation(notes = "社区类型",value = "响应指定数量的数据(类型1-6代表热门，旅行，生活，晒娃吃货，育儿")
    @GetMapping("/queryAllType.do")
    public ResultVo All() {
        return comService.queryAllType();
    }

    @ApiOperation(notes = "社区类型",value = "用数字1-6代替名称")
    @PostMapping("/saveType.do")
    public ResultVo save(Communitytype co) {
        return comService.saveType(co);
    }

}

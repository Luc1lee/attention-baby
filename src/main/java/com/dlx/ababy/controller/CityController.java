package com.dlx.ababy.controller;

import com.dlx.ababy.service.AreaService;
import com.dlx.ababy.service.CityService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "育宝宝项目",value = "接口文档")
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cs;

    @Autowired
    private AreaService as;

    @ApiOperation(notes = "传城市id，进行查询，城市id（ctId）,如果id为空查询城市列表，如果不为空查询城市下地区列表",value = "查询宝宝信息接口")
    @GetMapping("/select.do")
    @CrossOrigin
    public ResultVo select(Integer ctId) {
        if (ctId == null || ctId.equals("")){
            return  cs.selectAll();
        } else {
            return  as.selectByCtId(ctId);
        }
    }

}

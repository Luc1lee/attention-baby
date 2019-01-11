package com.dlx.ababy.controller;

import com.dlx.ababy.entity.Attention;
import com.dlx.ababy.service.AttentionService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
@RequestMapping("attention")
public class AttentionController {
    @Autowired
    private AttentionService atService;

    @ApiOperation(notes = "关注",value = "新增关注，需要关注人id(atUFid)和被关注人id(atUBid),不需要atId")
    @PostMapping("/attenSave.do")
    public ResultVo Save(Attention attention) {

        return atService.save(attention);
    }
    @ApiOperation(notes = "取消关注",value = "取消关注，需要关注人id和被关注人id")
    @GetMapping("/attenDel.do")
    public ResultVo deleteAtten(int Uid,int Bid) {

        return atService.delete(Uid,Bid);
    }
    @ApiOperation(notes = "所有关注",value = "获取所有关注信息，返回关注者与被关注者名字")
    @GetMapping("/attenAll.do")
    public ResultVo selAtten() {

        return atService.queryAll();
    }
    @ApiOperation(notes = "所有关注",value = "获取所有关注信息，需要页码和条数，返回关注者与被关注者名字")
    @GetMapping("/attenAllByPage.do")
    public PageBeanVo selAttenByPage(int page, int limit) {

        return atService.queryAllByPage(page,limit);
    }
    @ApiOperation(notes = "所有关注",value = "获取所有关注信息，需要页码和条数，通过用户id返回所有被关注者发表的信息")
    @GetMapping("/attenAllByUid.do")
    public PageBeanVo selAttenByUid(int Uid,int page, int limit) {

        return atService.queryAllByUid(Uid,page,limit);
    }

}

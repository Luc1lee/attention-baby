package com.dlx.ababy.controller;

import com.dlx.ababy.entity.Like;
import com.dlx.ababy.service.LikeService;
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

@Api(produces = "点赞功能",value = "接口文档")
@RestController
@RequestMapping("/like")
public class LikeController {


    @Autowired
    private LikeService ls;

    @ApiOperation(notes = "传like基本信息，进行添加，like对象：必传用户id（lkUId），社区id（lkComId）、评论id（lkCmtId）二选一",value = "添加like接口")
    @PostMapping("/add.do")
    @CrossOrigin
    public ResultVo add(Like like) {
        return ls.addLike(like);
    }

    @ApiOperation(notes = "传like基本信息，取消点赞，like对象：必传用户id（lkUId），社区id（lkComId）、评论id（lkCmtId）二选一",value = "取消点赞接口")
    @PostMapping("/delete.do")
    @CrossOrigin
    public ResultVo delete(Like like) {
        return ls.addLike(like);
    }
}

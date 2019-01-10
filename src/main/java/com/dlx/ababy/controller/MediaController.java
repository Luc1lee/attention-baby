package com.dlx.ababy.controller;

import com.dlx.ababy.service.AlbumService;
import com.dlx.ababy.service.MediaService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "育宝宝项目",value = "媒体文件接口文档")
@RestController
@RequestMapping("/media")
public class MediaController {

    @Autowired
    private MediaService mediaService;

    @ApiOperation(notes = "传媒体文件种类(0音乐，1故事,2早教，3家教，4宝健)mdType及歌单mdMmId获取歌单列表音频文件",value = "获取音频")
    @GetMapping("/musiclist.do")
    public ResultVo albumDetail(Integer mdType, Integer mdMmId) { return mediaService.queryMusicMenu(mdType,mdMmId); }
}

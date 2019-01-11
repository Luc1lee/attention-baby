package com.dlx.ababy.controller;

import com.dlx.ababy.service.MusicmenuService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "育宝宝项目",value = "音频菜单接口文档")
@RestController
@RequestMapping("/mm")
@CrossOrigin
public class MusicmenuController {

    @Autowired
    private MusicmenuService musicmenuService;

    @ApiOperation(notes = "查询音频单(歌单，故事单)",value = "获取音频单名及图片")
    @GetMapping("/mmenuinfo.do")
    public ResultVo queryMmInfo(Integer mmid) { return musicmenuService.queryMusicMenuInfo(mmid); }

    @ApiOperation(notes = "查询音频单(歌单，故事单)列表",value = "获取音频单名及图片")
    @GetMapping("/mmenulist.do")
    public ResultVo queryMmInfoList(Integer mdType) { return musicmenuService.queryMusicMenuList(mdType); }



}

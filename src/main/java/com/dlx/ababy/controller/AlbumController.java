package com.dlx.ababy.controller;


import com.dlx.ababy.dao.AlbumMapper;
import com.dlx.ababy.entity.Album;
import com.dlx.ababy.service.AlbumService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(produces = "育宝宝项目",value = "实体相册接口文档")
@RestController
@RequestMapping("/user")
@CrossOrigin
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @ApiOperation(notes = "查询相册信息",value = "获取相册信息")
    @GetMapping("/album.do")
    public ResultVo albumDetail() {
        return albumService.queryAlbumDetail();
    }

    @ApiOperation(notes = "查询相册状态，传uId",value = "获取相册状态")
    @GetMapping("/albumstatus.do")
    public ResultVo albumStatus(Integer uid) {
        return albumService.queryAlbumByUid(uid);
    }

    @ApiOperation(notes = "购买相册，传相册对象属性uId，alFlag（1-待付款2-待发货3-待收货4-已收货），alPrice，alImg",value = "添加购买相册")
    @GetMapping("/buyalbum.do")
    public ResultVo buyAlbum(Album album) {
        return albumService.buyAlbumByUid(album);
    }
}

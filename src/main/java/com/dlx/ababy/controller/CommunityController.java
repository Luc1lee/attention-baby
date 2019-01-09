package com.dlx.ababy.controller;

import com.dlx.ababy.entity.Community;
import com.dlx.ababy.service.CommunityService;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
@RequestMapping("community")
public class CommunityController {
    @Autowired
    private CommunityService commService;

    @ApiOperation(notes = "动态",tags = {"发表社区动态接口"},value = "发表新的社区动态")
    @PostMapping("/communitySave.do")
    public ResultVo Save(Community community) {
        return commService.save(community);
    }

    @ApiOperation(notes = "查找",tags = {"查找社区动态接口"},value = "根据五种基本社区动态类型查找，需要参数id")
    @GetMapping("/communitySecletByComtId.do")
    public ResultVo SelectByComtId(Integer id) {

        return commService.queryCommByComtId(id);
    }

    @ApiOperation(notes = "查找",tags = {"查找热门社区动态接口"},value = "查找热门社区动态,点赞数需大于50")
    @GetMapping("/communitySelectByLikeNum.do")
    public ResultVo SelectByLikeNum() {

        return commService.queryCommByLikeNum();
    }

    @ApiOperation(notes = "删除",tags = {"删除社区动态接口"},value = "删除社区动态")
    @GetMapping("/communityDel.do")
    public ResultVo Deletecomm(int id) {

        return commService.delete(id);
    }
}

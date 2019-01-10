package com.dlx.ababy.controller;


import com.dlx.ababy.entity.Comment;
import com.dlx.ababy.service.CommentService;
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


@Api(produces = "评论功能",value = "接口文档")
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService cs;

    @ApiOperation(notes = "传评论基本信息，必须上传：客户id（cmtUId）、评论等级（cmtLevel 1.回复说说的评论，2.回复评论的评论）；选择上传：（说说id（cmtComId）,传等级为1）、（被回复评论id（cmtParentId），传等级为2）二选一，评论内容（cmtInfo）可以为空",value = "添加评论接口")
    @PostMapping("/add.do")
    @CrossOrigin
    public ResultVo add(Comment comment){
        return cs.addComment(comment);
    }

    @ApiOperation(notes = "传评论id（cmtId）",value = "删除接口")
    @PostMapping("/del.do")
    @CrossOrigin
    public ResultVo delete(int cmtId){
        return cs.deleteComment(cmtId);
    }

}

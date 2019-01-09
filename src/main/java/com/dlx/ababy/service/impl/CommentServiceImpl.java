package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.CommentMapper;
import com.dlx.ababy.entity.Comment;
import com.dlx.ababy.service.CommentService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper cm;

    @Override
    public ResultVo addComment(Comment comment) {

        if (comment != null && !comment.equals("")) {

            Date date = new Date();
            comment.setCmtDate(date);
            cm.insert(comment);
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }

    }

    @Override
    public ResultVo deleteComment(Integer cmtId) {

        try {
            cm.deleteByPrimaryKey(cmtId);
            return ResultVo.setOK(null);
        } catch (Exception e) {
            return ResultVo.setERROR();
        }

    }
}

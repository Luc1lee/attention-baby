package com.dlx.ababy.service;

import com.dlx.ababy.entity.Comment;
import com.qfedu.vo.ResultVo;

public interface CommentService {

    ResultVo addComment(Comment comment);

    ResultVo deleteComment(Integer cmtId);
}

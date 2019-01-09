package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.CommentMapper;
import com.dlx.ababy.dao.CommunityMapper;
import com.dlx.ababy.dao.LikeMapper;
import com.dlx.ababy.entity.Comment;
import com.dlx.ababy.entity.Community;
import com.dlx.ababy.entity.Like;
import com.dlx.ababy.service.LikeService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    private LikeMapper lm;

    @Autowired
    private CommunityMapper cm;

    @Autowired
    private CommentMapper ctm;

    @Override
    public ResultVo addLike(Like like) {

        if (like != null && !like.equals("")) {
            lm.insert(like);
            if (like.getLkCmtId() != null && !like.getLkCmtId().equals("")) {
                Comment comment = ctm.selectByPrimaryKey(like.getLkCmtId());
                if (comment.getCmtLikenum() == null || comment.getCmtLikenum().equals("")){
                    comment.setCmtLikenum(1);
                    ctm.updateByPrimaryKey(comment);
                } else {
                    comment.setCmtLikenum(comment.getCmtLikenum() + 1);
                    ctm.updateByPrimaryKey(comment);
                }
                return ResultVo.setOK(null);
            }
            if (like.getLkComId() != null && !like.getLkComId().equals("")) {
                Community community = cm.selectByPrimaryKey(like.getLkComId());
                if (community.getComLikenum() == null || community.getComLikenum().equals("")) {
                    community.setComLikenum(1);
                    cm.updateByPrimaryKey(community);
                } else {
                    community.setComLikenum(community.getComLikenum() + 1);
                    cm.updateByPrimaryKey(community);
                }
                return ResultVo.setOK(null);
            }

        } else {
            return ResultVo.setERROR();
        }



        return null;
    }

    @Override
    public ResultVo deleteLike(Like like) {

        if (like == null || like.equals("")) {
            return ResultVo.setERROR();
        } else {
            lm.deleteLike(like);
            return ResultVo.setOK(null);
        }

    }
}

package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.ImgMapper;
import com.dlx.ababy.dao.MediaMapper;
import com.dlx.ababy.dao.OpinionMapper;
import com.dlx.ababy.entity.Img;
import com.dlx.ababy.entity.Media;
import com.dlx.ababy.entity.Opinion;
import com.dlx.ababy.service.OpinionService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpinionServiceImpl implements OpinionService {

    @Autowired
    private OpinionMapper om;

    @Autowired
    private ImgMapper ig;

    @Override
    public ResultVo addOpinion(Opinion opinion, String imgUrl) {

        if (opinion == null || opinion.equals("")){
            return ResultVo.setERROR();
        } else {
            om.insert(opinion);

            if (imgUrl != null && imgUrl.equals("")){
                Img img = new Img();
                img.setImgOpId(opinion.getOpId());
                img.setImgUrl(imgUrl);
                ig.insert(img);

            }

            return ResultVo.setOK(null);

        }
    }
}

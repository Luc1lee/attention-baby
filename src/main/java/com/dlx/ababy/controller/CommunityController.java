package com.dlx.ababy.controller;

import com.dlx.ababy.entity.Community;
import com.dlx.ababy.entity.Img;
import com.dlx.ababy.service.CommunityService;
import com.dlx.ababy.service.ImgService;
import com.dlx.ababy.vo.CommunityVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
@RequestMapping("community")
public class CommunityController {
    @Autowired
    private CommunityService commService;
    @Autowired
    private ImgService imgService;
    @ApiOperation(notes = "动态",tags = {"发表社区动态接口"},value = "发表新的社区动态,需要传递上传成功的imgurl")
    @PostMapping("/communitySave.do")
    public ResultVo Save(CommunityVo vo) {
        List<String> url = vo.getImgUrl();
        Community co = new Community();
        co.setuId(co.getuId());
        co.setComInfo(co.getComInfo());
        co.setComDate(co.getComDate());
        commService.save(co);
        for (int i =0; i < url.size(); i++) {
            Img img = new Img();
            img.setImgUrl(url.get(i));
            img.setImgComId(commService.selectByInfo(vo.getComInfo()).getComId());
            imgService.save(img);
        }
        return ResultVo.setOK(null);
    }

    @ApiOperation(notes = "查找",value = "根据五种基本社区动态类型查找，需要页码和条数，需要参数id")
    @GetMapping("/communitySecletByComtId.do")
    public PageBeanVo SelectByComtId(Integer id,int page, int limit) {

        return commService.queryCommByComtId(id,page,limit);
    }

    @ApiOperation(notes = "查找",value = "查找热门社区动态,点赞数大于50即热门，需要页码和条数")
    @GetMapping("/communitySelectByLikeNum.do")
    public PageBeanVo SelectByLikeNum(int page, int limit) {

        return commService.queryCommByLikeNum(page,limit);
    }

    @ApiOperation(notes = "删除",value = "删除社区动态")
    @GetMapping("/communityDel.do")
    public ResultVo Deletecomm(int id) {

        return commService.delete(id);
    }
}

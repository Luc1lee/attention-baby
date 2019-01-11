package com.dlx.ababy.controller;

import com.dlx.ababy.entity.Community;
import com.dlx.ababy.entity.Food;
import com.dlx.ababy.entity.Img;
import com.dlx.ababy.service.FoodService;
import com.dlx.ababy.service.ImgService;
import com.dlx.ababy.vo.CommunityVo;
import com.dlx.ababy.vo.FoodVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodService fService;
    @Autowired
    private ImgService imgService;
    @ApiOperation(notes = "新增食物接口",value = "新增食物,需要传递上传成功的imgurl")
    @PostMapping("/foodSave.do")
    public ResultVo Save(FoodVo vo) {
        List<String> url = vo.getImgUrl();
        Food food = new Food();
        food.setFdId(vo.getFdId());
        food.setFdCook(vo.getFdCook());
        food.setFdInfo(vo.getFdInfo());
        food.setFdName(vo.getFdName());
        food.setFdType(vo.getFdType());
        fService.save(food);
        for (int i =0; i < url.size(); i++) {
            Img img = new Img();
            img.setImgUrl(url.get(i));
            img.setImgFdId(fService.selectByName(vo.getFdName()).getFdId());
            imgService.save(img);
        }
        return ResultVo.setOK(null);
    }
    @ApiOperation(notes = "分页获取所有食物信息接口",value = "需要页码和条数，返回所有食物信息")
    @GetMapping("/foodAll.do")
    public PageBeanVo selFoodByPage(int page, int limit) {
        return fService.queryAllFood(page, limit);
    }

    @ApiOperation(notes = "查询食物信息接口",value = "可以输入名字，信息，类型，做法，返回食物信息")
    @GetMapping("/foodSearch.do")
    public ResultVo foodSearch(String str) {
        return ResultVo.setOK(fService.queryByCondition(str));
    }
}

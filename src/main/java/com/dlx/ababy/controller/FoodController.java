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
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
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
    @ApiOperation(notes = "新增食物接口",value = "新增食物,不需要传递fdId，需要传递上传成功的imgurl")
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

    @ApiOperation(notes = "查询食物信息接口",value = "可以输入名字，返回食物信息")
    @GetMapping("/foodSearch.do")
    public ResultVo foodSearch(HttpServletRequest request) throws UnsupportedEncodingException {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String fdName = request.getParameter("fdName");
        fdName =  java.net.URLDecoder.decode(fdName,"UTF-8");
        System.out.println(fdName);
        if (fdName.equals("") || fdName == null) {
            return ResultVo.setERROR();
        } else {
            map.put("fdName", fdName);
            List<FoodVo> list = fService.queryByCondition(map);

            return ResultVo.setOK(list);
        }
    }
    @ApiOperation(notes = "查询食物信息接口",value = "可以输入类型id，返回食物信息")
    @GetMapping("/foodSearchByType.do")
    public ResultVo foodSearchByType(int id) {
            List<FoodVo> list = fService.queryByType(id);

            return ResultVo.setOK(list);

    }
}

package com.dlx.ababy.controller;

import com.dlx.ababy.entity.BabyInfo;
import com.dlx.ababy.service.BabyInfoService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/babyinfo")
public class BabyInfoController {

    @Autowired
    private BabyInfoService bis;

    @PostMapping("/add.do")
    @CrossOrigin
    public ResultVo addBabyInfo(BabyInfo babyInfo){
        return bis.addBabyInfo(babyInfo);
    }

    @GetMapping("/findbybid.do")
    @CrossOrigin
    public ResultVo findByBId(Integer biBId){
        return bis.findByBId(biBId);
    }

}

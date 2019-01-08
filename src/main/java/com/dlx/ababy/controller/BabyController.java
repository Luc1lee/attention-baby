package com.dlx.ababy.controller;

import com.dlx.ababy.entity.Baby;
import com.dlx.ababy.service.BabyService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baby")
public class BabyController {

    @Autowired
    private BabyService bs;

    @PostMapping("/add.do")
    @CrossOrigin
    public ResultVo addBaby(Baby baby){
        return bs.addBaby(baby);
    }

    @PostMapping("/update.do")
    @CrossOrigin
    public ResultVo updateBaby(Baby baby){
        return bs.updateBaby(baby);
    }

    @PostMapping("/findbyuid.do")
    @CrossOrigin
    public ResultVo findByBId(Integer babyUId){
        return bs.selectByUId(babyUId);
    }
}

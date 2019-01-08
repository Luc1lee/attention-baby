package com.dlx.ababy.controller;

import com.dlx.ababy.service.AreaService;
import com.dlx.ababy.service.CityService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cs;

    @Autowired
    private AreaService as;

    @GetMapping("/select.do")
    @CrossOrigin
    public ResultVo select(Integer ctId) {
        if (ctId == null || ctId.equals("")){
            return  cs.selectAll();
        } else {
            return  as.selectByCtId(ctId);
        }
    }

}

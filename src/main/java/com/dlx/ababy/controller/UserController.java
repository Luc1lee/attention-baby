package com.dlx.ababy.controller;

import com.dlx.ababy.entity.User;
import com.dlx.ababy.service.UserService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService us;

    @PostMapping("/add.do")
    @CrossOrigin
    public ResultVo addUser(User user) {
        return us.addUser(user);
    }

    @PostMapping("/login.do")
    @CrossOrigin
    public ResultVo login(String name, String password) {
        return us.login(name,password);
    }

    @PostMapping("/update.do")
    @CrossOrigin
    public ResultVo updateUser(User user) {
        return us.updateByCondition(user);
    }

    @PostMapping("/updatetime.do")
    @CrossOrigin
    public ResultVo updateSviptime(Integer id) {
        return us.updateSVIP(id);
    }

    @GetMapping("/findbyid.do")
    @CrossOrigin
    public ResultVo findById(Integer id){
        return us.findById(id);
    }

}

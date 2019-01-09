package com.dlx.ababy.controller;

import com.dlx.ababy.entity.User;
import com.dlx.ababy.service.UserService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(produces = "育宝宝项目",value = "接口文档")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService us;

    @ApiOperation(notes = "传user基本信息，进行注册",tags = {"对象"},value = "注册接口")
    @PostMapping("/add.do")
    @CrossOrigin
    public ResultVo addUser(@ApiParam(value = "对象") User user) {
        return us.addUser(user);
    }

    @ApiOperation(notes = "传user基本信息，用户名，密码",tags = {"用户名","密码"},value = "登录接口")
    @PostMapping("/login.do")
    @CrossOrigin
    public ResultVo login(@ApiParam(value = "用户名")String tel, @ApiParam(value = "密码")String password) {
        return us.login(tel,password);
    }

    @ApiOperation(notes = "传user信息，要修改的信息，用户id，SVIP除外",tags = {"对象"},value = "用户信息上传接口")
    @PostMapping("/update.do")
    @CrossOrigin
    public ResultVo updateUser(@ApiParam(value = "对象")User user) {
        return us.updateByCondition(user);
    }

    @ApiOperation(notes = "传用户id，更改会员到期时间",tags = {"用户id"},value = "vip开通、续费接口")
    @PostMapping("/updatetime.do")
    @CrossOrigin
    public ResultVo updateSviptime(@ApiParam(value = "用户id")Integer id) {
        return us.updateSVIP(id);
    }

    @GetMapping("/findbyid.do")
    @CrossOrigin
    public ResultVo findById(Integer id){
        return us.findById(id);
    }

}

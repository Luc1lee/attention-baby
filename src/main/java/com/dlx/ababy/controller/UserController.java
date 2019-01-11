package com.dlx.ababy.controller;


import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.dlx.ababy.entity.User;
import com.dlx.ababy.service.UserService;
import com.dlx.ababy.tokenVerify.JwtVerify;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(produces = "育宝宝项目",value = "接口文档")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService us;

    @ApiOperation(notes = "传user基本信息，进行注册",value = "注册接口")
    @PostMapping("/add.do")
    @CrossOrigin
    public ResultVo addUser(User user) {
        return us.addUser(user);
    }

    @ApiOperation(notes = "传user基本信息，用户名，密码",value = "登录接口")
    @PostMapping("/login.do")
    @CrossOrigin
    public ResultVo login(String tel, String password) {
        ResultVo vo = us.login(tel, password);
        User user = us.selectByTel(tel);
        String id = user.getId().toString();
        if (vo.getCode() == 0) {

            String token = JwtVerify.sign(tel, id);


            if (token != null) {
                return ResultVo.setOK(token);
            } else {
                return ResultVo.setERROR();
            }

        } else {
            return ResultVo.setERROR();
        }
    }

    @ApiOperation(notes = "传user信息，要修改的信息，用户id，SVIP除外",value = "用户信息上传接口")
    @PostMapping("/update.do")
    @CrossOrigin
    public ResultVo updateUser(User user) {
        return us.updateByCondition(user);
    }

    @ApiOperation(notes = "传用户id，更改会员到期时间",value = "vip开通、续费接口")
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

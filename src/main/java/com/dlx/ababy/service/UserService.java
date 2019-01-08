package com.dlx.ababy.service;

import com.dlx.ababy.entity.User;
import com.qfedu.vo.ResultVo;

public interface UserService {
    ResultVo addUser(User user);

    ResultVo login(String name, String password);

    ResultVo updateByCondition(User user);

    ResultVo updateSVIP(Integer id);

    ResultVo findById(Integer id);
}

package com.dlx.ababy.service.impl;

import com.dlx.ababy.dao.UserMapper;
import com.dlx.ababy.entity.User;
import com.dlx.ababy.service.UserService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper um;

    @Override
    public ResultVo addUser(User user) {
       /* User user1 = um.selectByTel(user.getTel());*/
       /* if (user1 != null && !user1.equals("")){*/
            um.insert(user);
            return  ResultVo.setOK(user);
       /* } else {
            return ResultVo.setERROR();
        }*/

    }

    @Override
    public ResultVo login(String tel, String password) {
        if (tel !=null && !tel.equals("") && password != null && !password.equals("") ){
            User user = um.selectByTel(tel);
            if (user.getPassword().equals(password)) {
                return ResultVo.setOK(null);
            } else {
                return ResultVo.setERROR();
            }
        } else {
            return ResultVo.setERROR();
        }
    }

    @Override
    public ResultVo updateByCondition(User user) {
        if (user != null && !user.equals("")){
            um.updateByPrimaryKeySelective(user);
            return  ResultVo.setOK(null);
        }else {
            return ResultVo.setERROR();
        }

    }

    @Override
    public ResultVo updateSVIP(Integer id) {

        User user = um.selectByPrimaryKey(id);

        if (user.getSviptime() == null || user.getSviptime().equals("")){
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            c.add(Calendar.MONTH, 3);
            Date date = new Date();
            date = c.getTime();
            user.setSviptime(date);
            um.updateByPrimaryKeySelective(user);

            return  ResultVo.setOK(null);
        } else {
            Date date = user.getSviptime();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            calendar.add(Calendar.MONTH, 3);
            date = calendar.getTime();
            user.setSviptime(date);
            um.updateByPrimaryKeySelective(user);
        }

        return null;
    }

    @Override
    public ResultVo findById(Integer id) {
        User user = um.selectByPrimaryKey(id);

        return ResultVo.setOK(user);
    }

    @Override
    public User selectByTel(String tel) {
        return um.selectByTel(tel);
    }
}

package com.asugar.employmentmanage.controller;

import com.asugar.employmentmanage.common.BackResult;
import com.asugar.employmentmanage.common.ResultCode;
import com.asugar.employmentmanage.entity.User;
import com.asugar.employmentmanage.mapper.UserMapper;
import com.asugar.employmentmanage.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页控制和登陆控制
 */
@RestController
public class HomeController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping({"/","/employment"})
    public String index(){
        return "system/login";
    }

    @RequestMapping("/employment/login")
    public BackResult login(User user){
        user.setUserPwd(MD5Util.getMD5(user.getUserPwd()));
        User loginUser = userMapper.getUserByAccount(user.getUserAccount());
        if(loginUser == null || !loginUser.getUserPwd().equals(user.getUserPwd())){
            return  new BackResult(ResultCode.FAILURE.getCode(), ResultCode.FAILURE.getMsg(), 1, null);
        }else{
            return new BackResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), 1, loginUser);
        }
    }

}

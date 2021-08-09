package com.asugar.employmentmanage.controller;

import com.asugar.employmentmanage.common.BackResult;
import com.asugar.employmentmanage.common.ResultCode;
import com.asugar.employmentmanage.entity.User;
import com.asugar.employmentmanage.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/hello")
    public BackResult hello(){
        return new BackResult(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg(), 1,"hello");
    }

}

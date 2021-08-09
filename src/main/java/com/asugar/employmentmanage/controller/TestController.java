package com.asugar.employmentmanage.controller;

import com.asugar.employmentmanage.common.BackResult;
import com.asugar.employmentmanage.common.ResultCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @RequestMapping("/hello")
    public BackResult hello(){
        return new BackResult(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg(), 1,"hello");
    }

}

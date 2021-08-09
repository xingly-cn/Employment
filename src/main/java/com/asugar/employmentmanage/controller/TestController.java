package com.asugar.employmentmanage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RespectBinding;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world";
    }

}

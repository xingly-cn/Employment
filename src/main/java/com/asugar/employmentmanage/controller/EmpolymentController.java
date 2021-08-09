package com.asugar.employmentmanage.controller;

import com.asugar.employmentmanage.common.BackResult;
import com.asugar.employmentmanage.common.ResultCode;
import com.asugar.employmentmanage.entity.Employment;
import com.asugar.employmentmanage.mapper.EmploymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * 学生控制
 */
@Controller
public class EmpolymentController {
    @Autowired
    EmploymentMapper employmentMapper;
    // 学生页面
    @RequestMapping({"/employment/index", "/employment/employmentinfo"})
    public String index(){
        return "system/employmentinfo/employmentinfo";
    }

    // 查询所有学生
    @ResponseBody
    @RequestMapping("/employment/getallinfo")
    public BackResult getAllInfo(Employment employmentInfo, @RequestParam("limit") int pageSize, @RequestParam("page") int pageNum){
        List<Employment> infoList = employmentMapper.getAllEmploymentInfo(employmentInfo, pageNum, pageSize);
        return new BackResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), infoList.size(),infoList);
    }

    // 查询学生
    @ResponseBody
    @RequestMapping("/employment/getinfo")
    public BackResult getinfo(Employment info, @RequestParam("limit") int pageSize, @RequestParam("page") int pageNum){
        List<Employment> infoList = employmentMapper.getEmploymentInfo(info, pageNum, pageSize);
        return new BackResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), infoList.size(),infoList);
    }

    // 添加学生
    @ResponseBody
    @RequestMapping("/employment/addinfo")
    public BackResult addInfo(Employment info){
        info.setInformationId(UUID.randomUUID().toString());
        employmentMapper.addEmploymentInfo(info);
        return new BackResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), 1,1);
    }

    // 更新学生
    @ResponseBody
    @RequestMapping("/employment/updateinfo")
    public BackResult updateInfo(Employment info){
        employmentMapper.updateEmploymentInfo(info);
        return new BackResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), 1,1);
    }

    // 删除学生
    @ResponseBody
    @RequestMapping("/employment/delinfo/{infoId}")
    public BackResult delInfo(@PathVariable("infoId") String infoId){
        employmentMapper.deleteEmploymentInfo(infoId);
        return new BackResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), 1,1);
    }

}

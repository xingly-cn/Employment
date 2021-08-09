package com.asugar.employmentmanage.controller;

import com.asugar.employmentmanage.common.BackResult;
import com.asugar.employmentmanage.common.ResultCode;
import com.asugar.employmentmanage.mapper.EmploymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * 根据不同类型统计
 */
@RestController
public class EmploymentStatisticController {

    @Autowired
    EmploymentMapper employmentMapper;
    // 整体统计
    @RequestMapping("/employment/statistic")
    public String index(){
        return "system/employmentstatistic/employmentstatistic";
    }

    // 根据不同类型统计
    @RequestMapping("/employment/statistic/{fieldName}")
    public BackResult getStatisticData(@PathVariable("fieldName") String fieldName,
                                       @RequestParam("limit") int pageSize, @RequestParam("page") int pageNum){
        List<Map<String, String>> statisticResult = employmentMapper.getStudentCount(fieldName, pageNum, pageSize);
        return new BackResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), statisticResult.size(), statisticResult);
    }
}

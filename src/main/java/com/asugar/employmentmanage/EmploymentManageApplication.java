package com.asugar.employmentmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.asugar.employmentmanage.mapper")
@SpringBootApplication
public class EmploymentManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmploymentManageApplication.class, args);
    }

}

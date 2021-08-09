package com.asugar.employmentmanage.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

/**
 * 实体类：学生
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employment {
    private String informationId;
    private String companyName;
    private String companyAddress;
    private String employmentStation;
    private String treatment;
    private String abilityRequirement;
    private String studentName;
    private String studentMajor;
    private String studentGender;
    private String studentClass;
    private String studentMobile;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date employmentTime;
    private String companyContactName;
    private String companyContactMobile;

}

package com.asugar.employmentmanage.mapper;

import com.asugar.employmentmanage.entity.Employment;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface EmploymentMapper {
    List<Employment> getAllEmploymentInfo(Employment employment);
    List<Employment> getEmploymentInfo(Employment employment);
    List<Map<String, String>> getStudentCount(String fieldName);
    int addEmploymentInfo(Employment employment);
    int updateEmploymentInfo(Employment employment);
    int deleteEmploymentInfo(String infoId);
}

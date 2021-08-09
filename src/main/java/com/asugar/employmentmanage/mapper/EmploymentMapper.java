package com.asugar.employmentmanage.mapper;

import com.asugar.employmentmanage.entity.Employment;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface EmploymentMapper {
    List<Employment> getAllEmploymentInfo(Employment employment, int pageNum, int pageSize);
    List<Employment> getEmploymentInfo(Employment employment, int pageNum, int pageSize);
    List<Map<String, String>> getStudentCount(String fieldName, int pageNum, int pageSize);
    int addEmploymentInfo(Employment employment);
    int updateEmploymentInfo(Employment employment);
    int deleteEmploymentInfo(String infoId);
}

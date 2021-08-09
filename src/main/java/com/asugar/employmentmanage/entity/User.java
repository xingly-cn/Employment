package com.asugar.employmentmanage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 实体类：管理员
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userId;
    private String userAccount;
    private String userName;
    private String userPwd;
    private String userType;
}

package com.asugar.employmentmanage.mapper;

import com.asugar.employmentmanage.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 管理员接口
 */
@Repository
public interface UserMapper {
    List<User> getAllUsers(User user, int pageNum, int pageSize);
    User getUserById(String userId);
    User getUserByAccount(String userAccount);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(String userId);
}

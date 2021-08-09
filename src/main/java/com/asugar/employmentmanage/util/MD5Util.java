package com.asugar.employmentmanage.util;
import cn.hutool.crypto.SecureUtil;

/**
 * MD5加密工具类
 */
public class MD5Util {
    public static String getMD5(String password){
        String MD5_password = SecureUtil.md5(password);
        return MD5_password;
    }
}

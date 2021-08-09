package com.asugar.employmentmanage.common;
/**
 * 状态码枚举
 */
public enum ResultCode {

    SUCCESS(200, "成功"),
    FAILURE(500,"失败");

    private long code;
    private String msg;

    ResultCode(long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public long getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

package com.asugar.employmentmanage.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回格式封装
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackResult {
    private long code;
    private String msg;
    private long count;
    private Object data;
}

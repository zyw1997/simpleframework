package com.zyw.entity.dto;

import lombok.Data;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/18 14:33
 * @Description:
 */
@Data
public class Result<T> {
    //请求的状态码
    private int code;
    //请求的详情
    private String message;
    //本次请求返回的数据
    private T data;

}

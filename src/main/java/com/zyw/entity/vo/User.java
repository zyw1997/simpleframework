package com.zyw.entity.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/12 21:55
 * @Description:用户实体类
 */
@Data
public class User  {
    private Integer UserId;
    private String nickName;
    private String account;
    private String password;
    private String phoneNumber;
    private String email;
    private LocalDateTime lastLoginTime;

}

package com.zyw.service.combine;

import com.zyw.entity.dto.Result;
import com.zyw.entity.vo.User;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/18 14:48
 * @Description:
 */
public interface UserCombineService {
    Result<User> login(String username, String password);
}

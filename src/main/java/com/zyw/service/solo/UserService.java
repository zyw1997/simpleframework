package com.zyw.service.solo;

import com.zyw.entity.dto.Result;
import com.zyw.entity.vo.User;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/18 14:37
 * @Description:
 */
public interface UserService {
    Result<Boolean> addUser(User user);

    Result<Boolean> deleteUser(Integer userId);

    Result<User> queryUserById(Integer userId);

    Result<Boolean> ModifyPassWord(User user);

    Result<User> checkLoginUser(User userCondition);
}

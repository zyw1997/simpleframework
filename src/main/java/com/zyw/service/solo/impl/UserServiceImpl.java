package com.zyw.service.solo.impl;

import com.zyw.entity.dto.Result;
import com.zyw.entity.vo.User;
import com.zyw.service.solo.UserService;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/18 14:45
 * @Description:
 */
public class UserServiceImpl implements UserService {
    @Override
    public Result<Boolean> addUser(User user) {
        return null;
    }

    @Override
    public Result<Boolean> deleteUser(Integer userId) {
        return null;
    }

    @Override
    public Result<User> queryUserById(Integer userId) {
        return null;
    }

    @Override
    public Result<Boolean> ModifyPassWord(User user) {
        return null;
    }

    @Override
    public Result<User> checkLoginUser(User userCondition) {
        Result result = new Result();
        userCondition.setNickName("犀利的傻");
        result.setData(userCondition);
        result.setCode(200);
        result.setMessage("查询成功！");
        return result;
    }


}

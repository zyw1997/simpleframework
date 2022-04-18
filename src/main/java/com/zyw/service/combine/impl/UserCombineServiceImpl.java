package com.zyw.service.combine.impl;

import com.zyw.entity.dto.Result;
import com.zyw.entity.vo.User;
import com.zyw.service.combine.UserCombineService;
import com.zyw.service.solo.UserService;
import com.zyw.service.solo.impl.UserServiceImpl;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/18 14:49
 * @Description:
 */
public class UserCombineServiceImpl implements UserCombineService {
    private UserService userServiceImpl = new UserServiceImpl();

    @Override
    public Result login(String account, String password) {
        //创建一个用户登录的验证条件实体
        User userCondition = new User();
        userCondition.setAccount(account);
        userCondition.setPassword(password);
        //验证账号，密码
        Result<User> checkResult = userServiceImpl.checkLoginUser(userCondition);

        return checkResult;
    }
}

package com.zyw.action;

import com.zyw.entity.dto.Result;
import com.zyw.entity.vo.User;
import com.zyw.service.combine.UserCombineService;
import com.zyw.service.combine.impl.UserCombineServiceImpl;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/18 19:10
 * @Description:
 */
@Slf4j
public class LoginAction{
    private UserCombineService userCombineServiceImpl = new UserCombineServiceImpl();

}

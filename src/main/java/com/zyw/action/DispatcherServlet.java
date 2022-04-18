package com.zyw.action;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/18 20:19
 * @Description:作为服务的唯一入口，根据请求路径找到对应处理该请求的controller，并且传递参数
 */
@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求路径，以及请求方式
        String path = req.getServletPath();
        String method = req.getMethod();

        //获取参数map
        Map<String, String[]> map = req.getParameterMap();
        for (String key : map.keySet()) {
            String[] values = map.get(key);
            System.out.print(key + ":");
            for (String value : values) {
                System.out.println(value + " ");
            }
            System.out.println();
        }
    }
}

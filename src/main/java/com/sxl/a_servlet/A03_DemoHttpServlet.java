package com.sxl.a_servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: 苏小乐
 * @Date: 2020/2/23 22:21
 * @Description:
 */
public class A03_DemoHttpServlet extends HttpServlet {
    private static final Long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,HttpServletResponse response){
// 获取请求的方式
        String method = request.getMethod();
        System.out.println(method);

        // 1.获取请求参数
        String org = request.getParameter("org");
        String location = request.getParameter("location");
        System.out.println(org);
        System.out.println(location);
    }

    protected void doPost(HttpServletRequest request,HttpServletResponse response){
        // 获取请求的方式
        String method = request.getMethod();
        System.out.println(method);

        // 1.获取请求参数
        String org = request.getParameter("org");
        String location = request.getParameter("location");
        System.out.println(org);
        System.out.println(location);
    }

}

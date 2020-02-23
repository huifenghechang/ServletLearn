package com.sxl.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Auther: 苏小乐
 * @Date: 2020/2/23 21:19
 * @Description:
 */
public class HttpMethodServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("request is coming...");
        System.out.println(request);

        String user = request.getParameter("user");
        String password = request.getParameter("password");
        System.out.println(user + ", " + password);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

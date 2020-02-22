package com.sxl;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Auther: 苏小乐
 * @Date: 2020/2/22 21:56
 * @Description:
 */
public class LifeCycleServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        String country = servletConfig.getInitParameter("country");
        System.out.println("Init param :  "+ "country = " + country);
        System.out.println("Servlet init ... ");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet service ... ");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroy ... ");
    }
}

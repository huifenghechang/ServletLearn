package com.sxl.servlet;

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
        System.out.println("Init Servlet param :  "+ "country = " + country);
        ServletContext context = servletConfig.getServletContext();
        String language = context.getInitParameter("language");
        System.out.println("Init Context param :  "+ "language = " + language);
        System.out.println("Servlet init ... ");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String  param = servletRequest.getLocalName();
        System.out.println("Servlet parama ... " + param);

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

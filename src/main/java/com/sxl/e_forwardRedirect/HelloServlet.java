package com.sxl.e_forwardRedirect;

import org.omg.PortableServer.Servant;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Auther: 苏小乐
 * @Date: 2020/3/8 20:29
 * @Description:
 */
public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("Hello World !");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

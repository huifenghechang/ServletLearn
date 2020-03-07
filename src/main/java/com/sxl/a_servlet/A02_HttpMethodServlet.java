package com.sxl.a_servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Auther: 苏小乐
 * @Date: 2020/2/23 21:19
 * @Description:
 */
public class A02_HttpMethodServlet implements Servlet {
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

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>HttpMethodServlet ran!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>received data: </h1>");
        out.println("user is:"+user+" password is:"+password);
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

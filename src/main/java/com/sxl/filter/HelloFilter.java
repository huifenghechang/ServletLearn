package com.sxl.filter;


import java.io.IOException;
import javax.servlet.*;

/**
 * @Auther: 苏小乐
 * @Date: 2020/2/23 22:45
 * @Description:
 */
public class HelloFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init ...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("1.Before HelloServlet's chain Filter");
        servletRequest.setCharacterEncoding("utf-8");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("2. After HelloFilter's chain.doFilter...");
    }

    @Override
    public void destroy() {

    }
}

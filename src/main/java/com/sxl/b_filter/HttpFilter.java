package com.sxl.b_filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: 苏小乐
 * @Date: 2020/2/23 23:18
 * @Description:
 */
public abstract class HttpFilter implements Filter {
    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException{
        this.filterConfig  = filterConfig;
        init();
    }
    /**
     * 供子类继承的初始化方法. 可以通过 getFilterConfig() 获取 FilterConfig 对象.
     */
    protected void init() {}

    public FilterConfig getFilterConfig() {
        return filterConfig;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        doFilter(request, response, chain);
    }

    /**
     * 抽象方法, 为 Http 请求定制. 必须实现的方法.
     * @param request
     * @param response
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    public abstract void doFilter(HttpServletRequest request, HttpServletResponse response,
                                  FilterChain filterChain) throws IOException, ServletException;

    /**
     * 空的 destroy 方法。
     */
    @Override
    public void destroy() {}
}

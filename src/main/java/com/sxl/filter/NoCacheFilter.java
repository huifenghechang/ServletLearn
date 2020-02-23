package com.sxl.filter;

import javax.servlet.*;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: 苏小乐
 * @Date: 2020/2/23 22:58
 * @Description:
 */
public class NoCacheFilter extends HttpFilter {

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response,FilterChain chain) throws IOException, ServletException {
        response.setDateHeader("Expires",-1);
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Pragma","no-cache");
        chain.doFilter(request,response);
    }

}

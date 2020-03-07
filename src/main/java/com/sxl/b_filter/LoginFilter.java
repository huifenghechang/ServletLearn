package com.sxl.b_filter;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: 苏小乐
 * @Date: 2020/2/23 23:15
 * @Description:
 */
public class LoginFilter extends HttpFilter {
    // 1.从web.xml文件中获取 参数
    private String uncheckUrls;

    @Override
    protected void init(){

    }

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {

    }
}

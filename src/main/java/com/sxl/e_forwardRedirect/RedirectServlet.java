package com.sxl.e_forwardRedirect;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: 苏小乐
 * @Date: 2020/3/8 20:23
 * @Description:
 */
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("RedirectServlet's doGet Method");
        String path = "helloServlet";
        response.sendRedirect("/"+path);
    }

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response){

    }
}

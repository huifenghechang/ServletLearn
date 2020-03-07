<%--
  Created by IntelliJ IDEA.
  User: 苏小乐
  Date: 2020/3/7
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MinePage</title>
</head>
<body>
    <h3> Hello, Welcome to my space~</h3>
    <%
        //若可以获取到请求参数 name, 则打印出欢迎信息。
        // 把登录信息存储到 Cookie 中，并设置 Cookie 的最大时效为 30S
        String name = request.getParameter("name");
        if(name != null && !name.trim().equals("")){
            Cookie cookie = new Cookie("name", name);
            cookie.setMaxAge(30);
            response.addCookie(cookie);
        }else{
            //从 Cookie 中读取用户信息，若存在则打印欢迎信息
            Cookie [] cookies = request.getCookies();
            if(cookies != null && cookies.length > 0){
                for(Cookie cookie : cookies){
                    String cookieName = cookie.getName();
                    if("name".equals(cookieName)){
                        String val = cookie.getValue();
                        name = val;
                    }
                }
            }
        }

        if(name != null && !name.trim().equals("")){
            System.out.println("Hello: " + name);
        }else{
            //1. 若既没有请求参数，也没有 Cookie，则重定向到 login.jsp
            response.sendRedirect(request.getContextPath()+"login.jsp");

            // 2. 由于此处是将重定向代码写在jsp页面中，所以这种情况下，仅仅写login.jsp也是可以的。
            // c_cookieApp/autoLogin/login.jsp
//            response.sendRedirect("login.jsp");

            // 3. response.sendRedirect(参数);
            // 一般情况下，参数应该是：response.sendRedirect(request.getContextPath() + "/XXX.jsp");

        }
    %>
</body>
</html>

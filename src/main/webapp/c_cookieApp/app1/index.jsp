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
    <title>IndexPage</title>
</head>
<body>
    <%
        String name = request.getParameter("name");
        if(name !=null && !name.trim().equals("")){
            Cookie cookie = new Cookie("name",name);
            cookie.setMaxAge(30);
            response.addCookie(cookie);
        }else {
            Cookie[] cookies = request.getCookies();
            for(Cookie cookie:cookies){
                String cookieName = cookie.getName();
                if("sxl".equals(cookieName)){
                    String val = cookie.getValue();
                    name = val;
                }
            }
        }

        if(name != null && !name.trim().equals("")){
            System.out.println("Hello: " + name);
        }else {
            response.sendRedirect("cookieApp/app1/login.jsp");
        }
    %>

</body>
</html>

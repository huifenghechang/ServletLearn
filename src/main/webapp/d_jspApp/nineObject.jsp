<%--
  Created by IntelliJ IDEA.
  User: 苏小乐
  Date: 2020/3/8
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String userName = request.getParameter("userName");
        out.print(userName);
        response.getWriter().write("这是PrintWriter对象输出的内容");
    %>

</body>
</html>

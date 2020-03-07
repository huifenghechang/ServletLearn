<%--
  Created by IntelliJ IDEA.
  User: 苏小乐
  Date: 2020/3/7
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value = "${pageContext.request.contextPath}"  var="APP_PATH" scope="page"/>
<html>
<head>
    <title>LoginPage</title>
</head>
<body>
    <form action="${APP_PATH}/c_cookieApp/autoLogin/mine.jsp" method="post">
        name:<input type="text" name="name">
        <input type="submit" value="Submit">
    </form>
</body>
</html>

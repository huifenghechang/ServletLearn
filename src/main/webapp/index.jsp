
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String APP_PATH = request.getContextPath();
%>
<c:set value="${pageContext.request.contextPath}" var="APP_PATH" scope="page"/>
<html>
    <body>
    <h2>Welcome to Web Learning!</h2>

    <h3>a. Servlet Demo</h3>
    <a href="${APP_PATH}/a_servletApp/servlet.jsp">lifecycle of Servlet</a>


    </body>

</html>

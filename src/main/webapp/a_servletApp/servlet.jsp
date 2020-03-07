<html>
<body>
<h2>Servlet App Learning!</h2>
<h3>1. Servlet LifeCycle Demo</h3>
    <a href="/lifecycle">/lifecycle</a>
</body>

<h3>2. POST & GET Method Test</h3>
<form action="/httpMethod" method="post">
        user: <input type="text" name="user">
    <br>
    password: <input type="text" name="password">
    <br>
    interesting:
    <input type="checkbox" name="interesting" value="reading"/>Reading
    <input type="checkbox" name="interesting" value="game"/>Game
    <input type="checkbox" name="interesting" value="party"/>Party
    <input type="checkbox" name="interesting" value="shopping"/>Shopping
    <input type="checkbox" name="interesting" value="sport"/>Sport
    <input type="checkbox" name="interesting" value="tv"/>TV
    <br>
    <br>
    <input type="submit" value="Submit"/>
    <br>

</form>

<h3>3. HttpServlet Test</h3>
<form action="/httpServlet" method="get">
    org:<input type="text" name="org">
    location:<input type="text" name="location">

    <input type="submit" value="GetMethodSubmit">
</form>

<form action="/httpServlet" method="post">
    org:<input type="text" name="org">
    location:<input type="text" name="location">

    <input type="submit" value="PostMethodSubmit">
</form>


</html>

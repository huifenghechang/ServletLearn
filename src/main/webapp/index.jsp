<html>
    <body>
    <h2>Hello Servlet!</h2>
    <h3>Servlet LifeCycle Demo</h3>
    <a href="/lifecycle">/lifecycle</a>

    <h3>Service Test</h3>
    <form action="/httpMethod" method="post">

        user: <input type="text" name="user">
        <br>
        password: <input type="text" name="password">
        interesting:

        <input type="checkbox" name="interesting" value="reading"/>Reading
        <input type="checkbox" name="interesting" value="game"/>Game
        <input type="checkbox" name="interesting" value="party"/>Party
        <input type="checkbox" name="interesting" value="shopping"/>Shopping
        <input type="checkbox" name="interesting" value="sport"/>Sport
        <input type="checkbox" name="interesting" value="tv"/>TV

        <input type="submit" value="Submit"/>
    </form>

    <h3>HttpServlet Test</h3>
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

    </body>

</html>

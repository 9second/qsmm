<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/10/8
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
    <div style="margin: 0 auto;border: 1px red">
    <form name="registerUser" action="/user/registerUser" method="post">
        <label>用户名:</label><input type="text" name="username"><br>
        <label>密&nbsp;码:</label><input type="password" name="password"><br>
        <input type="submit" name="submit" value="注册">
    </form>
    </div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30.11.2021
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization</title>
</head>
<body>
<form action="/user/auth" method="post">
    <input type="text" name="login" placeholder="Login"/>
    <input type="text" name="password" placeholder="Password"/>
    <button>Submit</button>
</form>
<p>${message}</p>
</body>
</html>

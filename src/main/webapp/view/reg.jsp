<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30.11.2021
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<form action="/user/reg" method="post">
    <input type="text" name="login" placeholder="Login"/>
    <input type="text" name="password" placeholder="Password"/>
    <button>Submit</button>
    <p>${message}</p>
</form>
</body>
</html>

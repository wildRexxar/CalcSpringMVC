<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29.11.2021
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calc" method="post">
    <p><input type="text" name="num1" placeholder="Enter num"></p>

    <p><input type="text" name="num2" placeholder="Enter num"></p>

    <input type="radio" name="action" value="plus">+<br>
    <input type="radio" name="action" value="sub">-<br>
    <input type="radio" name="action" value="multi">*<br>
    <input type="radio" name="action" value="div">/<br>

    <p><button>Submit</button></p>
</form>
<p>Result = ${result}</p>
<a href="/">Home</a>
</body>
</html>

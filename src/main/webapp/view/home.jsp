<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30.11.2021
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:if test="${sessionScope.user == null}">
    <p>Hello Guest!</p>
    <a href="/user/reg">Registration</a>
    <a href="/user/auth">Authorization</a>
</c:if>

<c:if test="${sessionScope.user != null}">
    <p>Your number is ${sessionScope.user.id}!</p>
    <a href="/calc">Calculator</a>
    <a href="/calc/history">Result history</a>
    <a href="/user/logout">Logout</a>
</c:if>
</body>
</html>

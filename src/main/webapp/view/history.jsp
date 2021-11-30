<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30.11.2021
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Result History</title>
</head>
<body>

<c:if test="${requestScope.list != null}">
    <p>Result list:</p>
    <c:forEach items="${requestScope.list}" var="result">
        <p>${result}</p>
    </c:forEach>
</c:if>

<c:if test="${requestScope.list == null}">
    <p>Result list is empty</p>
</c:if>


<a href="/">Home</a>
</body>
</html>

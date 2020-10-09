<%--
  Created by IntelliJ IDEA.
  User: rich
  Date: 2019/5/19
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<h1>没有用户</h1>
<c:forEach items="${list}" var="acconut">
    ${acconut.name}<br>
</c:forEach>
</body>
</html>

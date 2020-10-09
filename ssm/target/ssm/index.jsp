<%--
  Created by IntelliJ IDEA.
  User: rich
  Date: 2019/5/19
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<a href="acconut/findAll">查询用户</a>

<form action="acconut/save" method="post">
    叫啥名<input type="text" name="name" >
    有多少钱<input type="text" name="money" >
    <input type="submit" value="注册">
</form>
</body>
</html>

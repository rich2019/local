<%--
  Created by IntelliJ IDEA.
  User: rich
  Date: 2019/4/25
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>anno</title>
</head>
<body>
<h1>注解专场</h1>
<a href="annotation/testRequestParam">testAnno</a><br>

<%--测试请求体注解 get方式不使用,也就是a标签不可以--%>
<form action="annotation/testRequestBody" method="post">
    姓名:<input type="text" name="username"/><br>
    密码:<input type="text" name="password"><br>
    金额:<input type="text" name="money"><br>
    <input type="submit" value="注册">
</form>

<a href="annotation/testRequestHeader">testRequestHeader</a><br>

<a href="annotation/testModelAttribute">testModelAttribute</a><br>


</body>
</html>

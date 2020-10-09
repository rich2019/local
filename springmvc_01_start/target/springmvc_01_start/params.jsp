<%--
  Created by IntelliJ IDEA.
  User: rich
  Date: 2019/4/23
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>params</title>
</head>
<body>
    <%--请求参数绑定--%>
    <a href="params/testParam?username=tom&password=123456" >参数绑定</a>
    <form action="params/saveAccount" method="post">
        姓名:<input type="text" name="username"/><br>
        密码:<input type="text" name="password"><br>
        金额:<input type="text" name="money"><br>
        用户:<input type="text" name="u.name"><br>
        年龄:<input type="text" name="u.age"><br>
        <input type="submit" value="注册">
    </form>

    <a href="params/testServlet?username=tom&password=1213456" >servlet测试</a>

</body>
</html>

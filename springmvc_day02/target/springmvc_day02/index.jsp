<%--
  Created by IntelliJ IDEA.
  User: rich
  Date: 2019/4/26
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <script src="js/jquery-3.3.1.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                alert("hello btn");
            });
        });
    </script>
</head>
<body>
<h1>主页</h1>

<button id="btn">按钮啊</button>

</body>
</html>

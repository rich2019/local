<%--
  Created by IntelliJ IDEA.
  User: rich
  Date: 2019/5/19
  Time: 0:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>响应json数据</title>
    <script src="js/jquery-3.3.1.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    //编写json格式,设置属性和值
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"tom","password":"123","age":19}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);

                    }
                });
            });
        });
    </script>
</head>

<body>
<input type="button" id="btn" value="发送ajax">发送ajax</input>

</body>
</html>

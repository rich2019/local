<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎登陆</title>
<style>
div {
	font-size: 30px;
	color: pink;
	text-align: center;
}

div2 {
	font-size: 30px;
	text-align: center;
}
div3 {
	font-size: 44px;
	color: black;
	text-align: center;
}
input{
  			width: 300px;
  			height: 45px;
  			font-size: 30px ;
  			border-top: 0;
  			border-left: 0;
  			border-right: 0;
  			border-bottom: 1px solid black;
  			text-align: center;
			outline: none;
  		}
a {
	text-decoration: none;
}
</style>
</head>
<body>
	<div>
		<h1>登陆界面</h1>
	</div>
	
	<div2>
		<form action="/car_oil/LoginServlet" method="post">
			用户名:<input type="text" placeholder="请输入用户名" name="username"><br><br> 
			密 &nbsp; 码:<input type="password" placeholder="请输入用密码" name="password"><br><br>
				<input type="submit" value="登陆" style="color:red">
		</form>
	</div2>
	<br><br><br><br><br><br>
	<div3>
		没有账号<a href="${pageContext.request.contextPath }/admin/regist.jsp">点击注册</a>
	</div3>

</body>
</html>
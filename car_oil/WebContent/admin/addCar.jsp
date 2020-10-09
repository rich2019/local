<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>车辆添加页面</title>
<style type="text/css">
div {
	font-size: 30px;
	color: red;
	text-align: right;
}
	a{text-decoration:none;}
div2 {
	font-size: 60px;
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
</style>
<script type="text/javascript">
function checkData(){
	if(document.getElementById("car_name").value == ""){
		alert("请输入汽车名称");
		return;
	}
	if(document.getElementById("oil_now").value == ""){
		alert("请输入剩余油量");
		return;
	}
	document.getElementById("from_addcar").submit();
}
</script>
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=1.0, user-scalable=no" />
</head>
<body>

<div>
	<a href="${pageContext.request.contextPath }/admin/login.jsp" target="viewFrame">切换账号</a>
	</div>

	<h1 align="center">欢迎${user.username },请添加你的车辆信息</h1>
	<br>
	<br>

	<div2>
	<form action="${pageContext.request.contextPath }/AddCarServlet" method="post" id="from_addcar">
		汽车名称:<input type="text" placeholder="请输入汽车名称" name="car_name" id="car_name" ><br><br> 
		现有油量:<input type="text" placeholder="请输入目前剩余油量" id="oil_now" name="oil_now" ><br><br> 
		<input type="button" value="添加" onclick="checkData()">
	</form>
	</div2>

</body>
</html>
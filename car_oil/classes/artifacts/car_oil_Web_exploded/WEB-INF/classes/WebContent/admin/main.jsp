<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户主界面</title>
<style type="text/css">
div {
	font-size: 30px;
	color: black;
	text-align: center;
}
</style>
</head>

<body>
	
	<div>
	<h1 align="center" >
		${user.username }你好<br>
		你的车辆为:${user.car_name }<br>
		目前剩余油量:${user.oil_now }升<br>
	</h1>
	</div>
	<br>
	<h1 align="center">请在每次加油后,及时在近期花费中更新消息,以便我们为您及时计算油量消耗</h1>
	
</body>


</html>
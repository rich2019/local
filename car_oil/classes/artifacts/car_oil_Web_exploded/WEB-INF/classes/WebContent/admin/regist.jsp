<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<meta charset="UTF-8">
<style type="text/css">
div {
	font-size: 30px;
	color: red;
	text-align: right;
}
	a{text-decoration:none;}
div2 {
	font-size: 40px;
	text-align: center;
}
input{
  			width: 300px;
  			height: 65px;
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
	function change(obj){
		obj.src="${pageContext.request.contextPath }/CheckCodeServlet?time="+new Date().getTime();
	}
	function checkData(){
		var username = document.getElementById("username");
		var password = document.getElementById("pwd");
		var password2 = document.getElementById("pwd2");
		var yam = document.getElementById("yzm");
		
		if(username.value == ""){
			alert("请输入用户名");
			return;
		}
		if(password.value == ""){
			alert("请输入密码");
			return;
		}
		if(password2.value == ""){
			alert("请再次输入密码");
			return;
		}
		//3。两次密码是否一样
	    if(password.value != password2.value){
	    	alert("两次输入的密码不一样");
	    	return;
	    }
	
		if(code.value == ""){
			alert("请输入验证码");
			return;
		}
		if(password.value == password2.value){
			var form = document.getElementById("reg_form");
			form.submit();
		}
	}
</script>
</head>
<body>

            <h1>欢迎注册</h1>

        <h1 >已有账户<a href="${pageContext.request.contextPath }/admin/login.jsp" style="font-size: 30px;">点击登录</a></h1>
			
			<div2>
            <form action="${pageContext.request.contextPath }/RegistServlet" id="reg_form" method="post" >
                    <label>用&nbsp;&nbsp;户&nbsp;&nbsp;名</label>
                    <input id="username"  type="text" placeholder="请输入用户名..." name="username"><br>
                    <label>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码</label>
                    <input id="pwd" type="password" placeholder="请输入密码.." name="password"><br>
                    <label>确认密码</label>
                    <input id="pwd2" type="password" placeholder="请再次输入密码..." name="password2"><br>
                    <label>电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话</label>
                    <input type="text" placeholder="选填" id="phone" name="phone"><br>
                    <label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    		验&nbsp;&nbsp;证&nbsp;&nbsp;码</label>
                    <input type="text" placeholder="点击图片换一张..." name="code" id="code">
                    <img src="${pageContext.request.contextPath }/CheckCodeServlet" onclick="change(this)" height="70" width="200"><br><br>
                    <input type="button" value="立即注册" onclick="checkData()">
            </form>
            </div2>
</body>
</html>
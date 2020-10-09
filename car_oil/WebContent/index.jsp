<%@page import="cn.aust.jike_16_1.car.dao.User"%>
<%@page import="cn.aust.jike_16_1.car.dao.LoginDao"%>
<%@page import="cn.aust.jike_16_1.car.web.LoginServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎注册</title>
	<style>
			div {
				font-size: 30px;
				color: pink;
				text-align: center;
			}
			
			a {
				text-decoration: none;
			}
		</style>
</head>
<body>
<div>
	<h1>欢迎来到汽车油耗统计系统</h1>
	<br /><br /><br />
	<a href="admin/regist.jsp">点击注册</a> 
	<br /><br /><br />
	<a href="admin/login.jsp">点击登陆</a>
</div>
	<br>
	<%
		String id = null;
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(Cookie cookie : cookies){
				String name = cookie.getName();
				if("id".equals(name)){
				//System.out.println(cookie.getValue());
				id = cookie.getValue();
				}
			}
		
		if(id != null){
			LoginDao loginDao = new LoginDao();
			User user = loginDao.loginById(id);
			session.setAttribute("user", user);
			response.sendRedirect("admin/view.jsp");
		}
	}
		
	%>
	
</body>
</html>
package cn.aust.jike_16_1.car.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.aust.jike_16_1.car.dao.User;
import cn.aust.jike_16_1.car.service.LoginService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文编码格式
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		 response.setCharacterEncoding("utf-8");
		
		//获取用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
//		byte[] b = username.getBytes("GBK");
//		username = new String(b,"UTF-8");
//		byte[] c = password.getBytes("GBK");
//		password = new String(c,"UTF-8");
		System.out.println(username);
		System.out.println(password);
		
		//从数据库查询用户的账号,密码是否正确
		LoginService loginService = new LoginService();
		User user = loginService.login(username, password);
		if(user == null) {
			response.getWriter().write("fail");
			//ou.write("<h1 用户名或密码错误</h1>");
			//response.setHeader("refresh", "2;url=/car_oil/admin/login.jsp");
		}else {
			PrintWriter ou = response.getWriter();
			ou.write("success");
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			
			Cookie cookie = new Cookie("id", user.getId()+"");
			response.addCookie(cookie);
			cookie.setMaxAge(60*24);
			
			//跳转至主页面
			//response.sendRedirect("admin/view.jsp");
		}
		
		
	}

}

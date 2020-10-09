package cn.aust.jike_16_1.car.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.aust.jike_16_1.car.service.RegistService;


@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//取出验证码并作比较
		String code = request.getParameter("code");
		String word = (String)this.getServletContext().getAttribute("checkCode");
		
		if(!(word.equals(code))) {
			response.getWriter().write("<h1>验证码输入错误</h1>");
			response.setHeader("refresh", "3,url=/car_oil/admin/regist.jsp");
		}
		else{
				//获取用户名和密码,存到数据库
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				String phone = request.getParameter("phone");
				System.out.println(phone);
				
				RegistService registService = new RegistService();
				String result = registService.saveUser(username, password,phone);
				if (result.equals("success")) {
					response.getWriter().write("<h1>注册成功</h1>");
					response.setHeader("refresh", "3,url=/car_oil/admin/login.jsp");
				} else {
					response.getWriter().write("<h1>用户名已被注册</h1>");
					response.setHeader("refresh", "3,url=/car_oil/admin/regist.jsp");
				} 
			}
		
		
	}

}

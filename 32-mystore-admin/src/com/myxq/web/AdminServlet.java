package com.myxq.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myxq.domain.Admin;
import com.myxq.service.AdminService;
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		AdminService adminService = new AdminService();
		try {
			Admin login = adminService.login(username,password);
			//将用户的信息存储到session中
			HttpSession session = request.getSession();
			session.setAttribute("admin", login);
			//浏览器跳转地址,要写全名称
			response.sendRedirect(request.getContextPath()+"/admin/admin_index.jsp");
		} catch (Exception e) {
			if(e.getMessage().equals("用户名或密码错误")) {
				//设置request域存储错误信息
				request.setAttribute("err",e.getMessage());
				//服务器内部跳转地址,不需要写全名,服务器会自动加上项目名
				request.getRequestDispatcher("admin/admin_login.jsp").forward(request, response);
			}else {
				e.printStackTrace();
			}
			
		}
		
	}

}

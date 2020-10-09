package cn.aust.jike_16_1.car.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.aust.jike_16_1.car.dao.User;
import cn.aust.jike_16_1.car.service.LoginService;

@WebServlet("/AddCarServlet")
public class AddCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String car_name = request.getParameter("car_name");
		String oil_now = request.getParameter("oil_now");
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		
		AddCarService addCarService = new AddCarService();
		try {
			addCarService.addCar(user,car_name,oil_now);
			
			//查找user
			LoginService loginService = new LoginService();
			User user2 = loginService.login(user.getUsername(),user.getPassword());
			
			//将新user存储到session中
			session.setAttribute("user", user2);
			//登陆成功跳转到主界面
			response.sendRedirect("admin/main.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}

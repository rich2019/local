package com.myxq.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myxq.domain.Category;
import com.myxq.service.CategoryService;

@WebServlet("/GoodsAddUIServlet")
public class GoodsAddUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取全部商品
		CategoryService categoryService = new CategoryService();
		List<Category> allCategory = null;
		try {
			allCategory = categoryService.addGoods();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//存储到request域中
		request.setAttribute("allCategory", allCategory);
		

		//跳转页面
		request.getRequestDispatcher("admin/add.jsp").forward(request, response);
	}

}

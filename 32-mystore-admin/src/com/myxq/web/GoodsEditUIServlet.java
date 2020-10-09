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
import com.myxq.domain.Goods;
import com.myxq.service.CategoryService;
import com.myxq.service.GoodsService;

@WebServlet("/GoodsEditUIServlet")
public class GoodsEditUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		GoodsService goodsService = new GoodsService();
		CategoryService categoryService = new CategoryService();
		try {
			Goods goods = goodsService.getGoodsById(id);
			List<Category> allActegory = categoryService.addGoods();
			request.setAttribute("goods", goods);
			request.setAttribute("allCategory", allActegory);
			request.getRequestDispatcher("admin/edit.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}

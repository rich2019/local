package com.myxq.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myxq.domain.Goods;
import com.myxq.service.GoodsService;

@WebServlet("/GoodsDelServlet")
public class GoodsDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		GoodsService goodsService = new GoodsService();
		Goods goods = new Goods();
		goods.setId(Integer.parseInt(id));
		try {
			goodsService.delGoods(goods);
			request.getRequestDispatcher("GoodsListServlet").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

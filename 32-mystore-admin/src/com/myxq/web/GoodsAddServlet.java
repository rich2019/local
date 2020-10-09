package com.myxq.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.myxq.domain.Goods;
import com.myxq.service.GoodsService;

@WebServlet("/GoodsAddServlet")
public class GoodsAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Map<String, String[]> parameterMap = request.getParameterMap();
		Goods goods = new Goods();
		GoodsService goodsService = new GoodsService();
		try {
			BeanUtils.populate(goods, parameterMap);
			goodsService.addGoods(goods);
			request.getRequestDispatcher("/GoodsListServlet").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

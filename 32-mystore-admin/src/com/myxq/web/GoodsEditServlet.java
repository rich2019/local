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

@WebServlet("/GoodsEditServlet")
public class GoodsEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// 1.获取所有参数
		Map<String, String[]> parameterMap = request.getParameterMap();
		Goods goods = new Goods();
		GoodsService goodsService = new GoodsService();
		try {
			// 2.封装成goods对象
			BeanUtils.populate(goods, parameterMap);
			// 3.更新数据库
			goodsService.updateGoods(goods);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//4.跳转到main页面
		request.getRequestDispatcher("GoodsListServlet").forward(request, response);

	}

}

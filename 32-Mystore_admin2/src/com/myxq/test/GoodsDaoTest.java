package com.myxq.test;

import java.sql.SQLException;
import java.util.List;


import com.myxq.dao.GoodsDao;
import com.myxq.domain.Goods;

public class GoodsDaoTest {
	private  GoodsDao goodsDao = new GoodsDao();

	public void testGetAllGoods() throws SQLException {
		
		List<Goods> allGoods = goodsDao.getAllGoods();
		System.out.println(allGoods);
	}
	

	public void testAddGoods() throws SQLException {
		Goods goods = new Goods();
		goods.setName("myxq1111");
		goods.setPrice(35.5);
		goods.setImage("goods_10.png");
		goodsDao.addGoods(goods);
	}
	

	public void testDelGoods() throws SQLException {
		
		goodsDao.delGoods(16);
	}
	
	


}

package com.myxq.service;

import java.sql.SQLException;
import java.util.List;

import com.myxq.dao.GoodsDao;
import com.myxq.domain.Goods;

public class GoodsService {
	private GoodsDao goodsDao = new GoodsDao();
	
	/**
	 * 查询所有商品
	 * @return
	 * @throws SQLException
	 */
	public List<Goods> getAllGoods() throws SQLException{
		List<Goods> allGoods = goodsDao.getAllGoods();
		return allGoods;
		
	}

	/**
	 * 删除商品
	 * @param goods
	 * @throws SQLException
	 */
	public void delGoods(Goods goods) throws SQLException {
		goodsDao.deleteGoods(goods);
		
	}

	/**
	 * 增加商品
	 * @param goods
	 * @throws SQLException
	 */
	public void addGoods(Goods goods) throws SQLException{
		goodsDao.addGoods(goods);
		
	}

	/**
	 * 通过id查询商品
	 * @param id
	 */
	public Goods getGoodsById(String id) throws SQLException{
		return goodsDao.getGoodById(id);
		
	}

	
	/**
	 * 更新商品
	 * @param goods
	 */
	public void updateGoods(Goods goods) throws SQLException{
		goodsDao.updateGoods(goods);
		
	}

}

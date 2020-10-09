package com.myxq.service;

import java.sql.SQLException;
import java.util.List;

import com.myxq.dao.GoodsDao;
import com.myxq.domain.Goods;

public class GoodsService {
	private  GoodsDao goodsDao = new GoodsDao();
	public List<Goods> getAllGoods() throws SQLException {
		//�����ݿ⵱�л�ȡ���е�����
		List<Goods> allGoods = goodsDao.getAllGoods();
		return allGoods;
	}

	public void deleteGoods(String id) throws Exception {
		//����dao����ɾ����Ʒ
		goodsDao.delGoods(Integer.parseInt(id)); 
	}

	public void addGoods(Goods goods) throws Exception {
		//����dao �������
		goodsDao.addGoods(goods);
		
	}

	public Goods getGoodsWithId(String id) throws Exception {
		//����dao ��ѯһ����Ʒ����id����
	 	Goods goods = goodsDao.getGoodsWithId(id);
	 	return goods;
	}

	public void updateGoods(Goods goods) throws Exception {
		//����dao ������Ʒ
		goodsDao.updateGoods(goods);
	}


}

package com.myxq.dao;

import java.sql.SQLException;
import java.util.List;

import com.myxq.utils.JDBCUtilsConnection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.myxq.domain.Goods;

public class GoodsDao {
	QueryRunner qr = new QueryRunner();
	
	//1.查询所有商品
	public List<Goods> getAllGoods() throws SQLException{
		String sql = "select * from goods";
		List<Goods> goodsList = qr.query(JDBCUtilsConnection.getConnection(), sql,new BeanListHandler<Goods>(Goods.class));
		return goodsList;
	}
	//2.添加商品
	public void addGoods(Goods goods) throws SQLException {
		String sql = "insert into goods(name,price,image,gdesc,is_hot,cid) values(?,?,?,?,?,?)";
		qr.update(JDBCUtilsConnection.getConnection(),sql,goods.getName(),goods.getPrice(),
				goods.getImage(),goods.getGdesc(),goods.getIs_hot(),goods.getCid());
		
	}
	
	//3.更改商品
	public void updateGoods(Goods goods) throws SQLException {
		String sql = "update goods set name=?,price=?,image=?,gdesc=?,is_hot=?,cid=? where id=?";
		qr.update(JDBCUtilsConnection.getConnection(),sql,goods.getName(),goods.getPrice(),
				goods.getImage(),goods.getGdesc(),goods.getIs_hot(),goods.getCid(),goods.getId());
		
	}
	//4.删除商品
	public void deleteGoods(Goods goods) throws SQLException {
		String sql = "DELETE FROM goods WHERE id=?";
		qr.update(JDBCUtilsConnection.getConnection(),sql,goods.getId());
	}
	//5.通过id查询商品
	public Goods getGoodById(String id) throws SQLException{
		String sql = "select * from goods where id=?";
		return qr.query(JDBCUtilsConnection.getConnection(), sql,
				new BeanHandler<Goods>(Goods.class),Integer.parseInt(id));
		
	}
	
}

package com.myxq.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.myxq.domain.Goods;
import com.myxq.utils.JdbcUtil;

public class GoodsDao {
	private QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
	//1.�����ݿ⵱�в�ѯ������Ʒ�б�
	public List<Goods> getAllGoods() throws SQLException{
		
		//1.��ѯ����
		String sql = "select * from goods";
		//2ִ��sql
		List<Goods> allgoods = null;
		allgoods = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		return allgoods;
	}
	//2.�����Ʒ�����ݿ⵱��
	public void addGoods(Goods goods) throws SQLException {
		//�������9
		String sql = "insert into goods(name,price,image,gdesc,is_hot,cid) value (?,?,?,?,?,?)";
		qr.update(sql,goods.getName(),goods.getPrice(),goods.getImage(),goods.getGdesc(),goods.getIs_hot(),goods.getCid());
	}
	
	//3.����id�����ݿ⵱��ɾ��һ����Ʒ
	public void delGoods(int id) throws SQLException {
		//ɾ������
		String sql = "delete from goods where id=?";
		qr.update(sql,id);
	}
	
	//4.����һ����Ʒ�������ݿ��и���id���¸���Ʒ
	public void updateGoods(Goods goods) throws SQLException {
		//���²���
		String sql = "update goods set name=?,price=?,image=?,gdesc=?,is_hot=?,cid=? where id=?";
		qr.update(sql,goods.getName(),goods.getPrice(),goods.getImage(),goods.getGdesc(),goods.getIs_hot(),goods.getCid(),goods.getId());
	}
	//����id��ѯһ����Ʒ
	public Goods getGoodsWithId(String id) throws Exception {
		
		String sql = "select * from goods where id=?";
		Goods goods = qr.query(sql, new BeanHandler<Goods>(Goods.class),Integer.parseInt(id));
		return goods;
		
	}
	
}

package com.myxq.dao;

import java.sql.SQLException;
import java.util.List;

import com.myxq.utils.JDBCUtilsConnection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.myxq.domain.Category;

public class CategoryDao {

	public List<Category> addGoods() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from category";
		return qr.query(JDBCUtilsConnection.getConnection(),sql,
				new BeanListHandler<Category>(Category.class));
		
	}

}

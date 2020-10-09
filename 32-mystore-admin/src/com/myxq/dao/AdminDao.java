package com.myxq.dao;

import java.sql.SQLException;

import com.myxq.utils.JDBCUtilsConnection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.myxq.domain.Admin;

public class AdminDao {

	public Admin login(String username, String password) throws SQLException{
		QueryRunner qr = new QueryRunner();
		//String sql = "SELECT * FROM admin WHERE username='"+username+"' AND PASSWORD='"+password+"'";
		String sql = "SELECT * FROM admin WHERE username=? AND PASSWORD=?";
		Admin admin =null;
		admin = qr.query(JDBCUtilsConnection.getConnection(),sql,new BeanHandler<Admin>(Admin.class),username,password);
		return admin;
	}

}

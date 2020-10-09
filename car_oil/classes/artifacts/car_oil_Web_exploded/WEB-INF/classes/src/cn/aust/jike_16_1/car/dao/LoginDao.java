package cn.aust.jike_16_1.car.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.aust.jike_16_1.car.utils.JDBCUtilsConnection;

public class LoginDao {
	
	public User login(String username,String password) {
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM USER WHERE username='"+username+"' AND PASSWORD='"+password+"'";
		User user = null;
		try {
			user = qr.query(JDBCUtilsConnection.getConnection(), sql,new BeanHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	//自动登陆实现
	public User loginById(String id) {
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM USER WHERE id="+Integer.parseInt(id);
		User user = null;
		try {
			user = qr.query(JDBCUtilsConnection.getConnection(), sql,new BeanHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
}

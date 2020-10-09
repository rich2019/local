package cn.aust.jike_16_1.car.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.aust.jike_16_1.car.utils.JDBCUtilsConnection;

/**
 * 存储用户名和密码
 */
public class RegistDao {
	public String save(String username,String password,String phone) {
		QueryRunner qr = new QueryRunner();
		//先做判断用户名是否已经被注册
		User u = null;
		String sql = "SELECT * FROM USER WHERE username='"+username+"'";
		try {
			u = qr.query(JDBCUtilsConnection.getConnection(), sql,new BeanHandler<User>(User.class));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		if(u != null) {
			return "failed";
		}
		else {
			String sql2 = "INSERT INTO USER (username,PASSWORD,phone) VALUES(?,?,?)";
			try {
				qr.update(JDBCUtilsConnection.getConnection(),sql2,username,password,phone);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return "success";
		}
	}
}

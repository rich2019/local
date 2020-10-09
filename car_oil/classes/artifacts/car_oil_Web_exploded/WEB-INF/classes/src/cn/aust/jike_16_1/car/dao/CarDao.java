package cn.aust.jike_16_1.car.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import cn.aust.jike_16_1.car.utils.JDBCUtilsConnection;

public class CarDao {

	public void addCar(User user, String car_name, String oil_now) throws SQLException {
		//直接存了
		QueryRunner qr = new QueryRunner();
		String sql = "UPDATE USER SET car_name='"+car_name+
				"',oil_now='"+oil_now+"' WHERE id='"+user.getId()+"'";
		qr.update(JDBCUtilsConnection.getConnection(), sql);
		
		
	}

	
	

}

package cn.aust.jike_16_1.car.web;

import java.sql.SQLException;

import cn.aust.jike_16_1.car.dao.CarDao;
import cn.aust.jike_16_1.car.dao.User;

public class AddCarService {

	public void addCar(User user, String car_name, String oil_now) throws SQLException {
		CarDao carDao = new CarDao();
		carDao.addCar(user,car_name,oil_now);
		
	}

	

}

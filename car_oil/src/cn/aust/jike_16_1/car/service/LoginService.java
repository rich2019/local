package cn.aust.jike_16_1.car.service;

import cn.aust.jike_16_1.car.dao.LoginDao;
import cn.aust.jike_16_1.car.dao.User;

public class LoginService {
	LoginDao loginDao = new LoginDao();
	public User login(String username,String password) {
		User user = loginDao.login(username, password);
		return user;
	}
}

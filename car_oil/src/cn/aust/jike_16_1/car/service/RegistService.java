package cn.aust.jike_16_1.car.service;

import cn.aust.jike_16_1.car.dao.RegistDao;

public class RegistService {
	RegistDao saveUserDao = new RegistDao();
	
	public String saveUser(String username,String password,String phone) {
		return saveUserDao.save(username, password,phone);
		
	}
}

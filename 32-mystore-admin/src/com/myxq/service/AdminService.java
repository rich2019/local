package com.myxq.service;

import com.myxq.dao.AdminDao;
import com.myxq.domain.Admin;

public class AdminService {

	public Admin login(String username, String password) throws Exception {
		AdminDao adminDao = new AdminDao();
		Admin admin = adminDao.login(username, password);
		if(admin != null) {
			return admin;
		}else {
			throw new Exception("用户名或密码错误");
		}
	}

}

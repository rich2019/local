package com.myxq.service;

import java.sql.SQLException;
import java.util.List;

import com.myxq.dao.CategoryDao;
import com.myxq.domain.Category;

public class CategoryService {

	public List<Category> addGoods() throws SQLException {
		CategoryDao categoryDao = new CategoryDao();
		return categoryDao.addGoods();
		
	}

}

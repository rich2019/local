package com.myxq.service;

import java.util.List;

import com.myxq.dao.CategoryDao;
import com.myxq.domain.Category;

public class CategoryService {

	//��ȡ���еķ�����Ϣ
	public List<Category> findCategory() throws Exception {
		//�����ݿ⵱�в���
		CategoryDao categoryDao = new CategoryDao();
		List<Category> allCategory = categoryDao.getAllCategory();
		return allCategory;
	}

}

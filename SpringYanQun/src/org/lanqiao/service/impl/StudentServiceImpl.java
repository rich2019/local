package org.lanqiao.service.impl;

import java.sql.SQLException;

import org.lanqiao.dao.IStudentDao;
import org.lanqiao.entity.Student;
import org.lanqiao.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
    IStudentDao studentDao;

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    /*@Transactional(readOnly = false, propagation = Propagation.REQUIRED,
            rollbackFor = {SQLException.class, ArithmeticException.class})*/
    @Override
    public void addStudent(Student student) {
        //if(��ѧ���Ƿ����)
        //��������....
        studentDao = null;//�����쳣֪ͨ
        studentDao.addStudent(student);
//		int[] nums = new int[2] ;
//		nums[2] = 2;
        System.out.println("=====�������Ӳ���========");
//		return true ;
    }

    @Override
    public void deleteStudentByNo(int stuNo) {
        System.out.println("ģ��ɾ��....");
    }


}

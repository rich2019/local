package cn.itcast.test;

import cn.itcast.controller.AccountController;
import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AcconutService;
import cn.itcast.service.impl.AccountServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

public class TestSpring {

    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AcconutService accountService = (AcconutService) ac.getBean("accountService");
        accountService.findAll();
    }

    @Test
    public void testMybatis() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> list = dao.findAll();
        for(Account a :list){
            System.out.println(a);
        }
        in.close();
    }

    @Test
    public void testMybatisSave() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        Account a1 = new Account();
        a1.setName("张三");
        a1.setMoney(900.0);
        dao.saveAcconut(a1);
        //提交事务
        session.commit();
        in.close();
    }

}

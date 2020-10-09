package cn.itheima.test;
import cn.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class TestMybatis {

    public static void main(String[] args) throws IOException {
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.1", 10);
        System.out.println(user);

       /* List<User> user2 = sqlSession.selectList("test.findUserByUsername", "王五");
        System.out.println(user2);*/

      /* User u = new User();
       u.setId(29);
       u.setUsername("8888888");
       u.setBirthday(new Date());
       u.setAddress("淮南8888888");
       u.setSex("男");
       *//* int i = sqlSession.insert("test.insert",u);
        System.out.println(i);
        sqlSession.commit();
        System.out.println(u.getId());*//*
        int i = sqlSession.update("test.updateById", u);
        System.out.println(i);
        sqlSession.commit();*/
    }



    public void fun() throws IOException {
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.1", 10);
        System.out.println(user);
    }


}

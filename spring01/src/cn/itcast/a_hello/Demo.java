package cn.itcast.a_hello;

import cn.itcast.bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void fun1(){
        //1.创建容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.向容器对象要user
        User user = (User)ac.getBean("user");
        //3.打印user对象
        System.out.println(user);
    }
}

package cn.itheima.test;

import cn.itheima.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JacksonTest {

    @Test
    public void fun1() throws IOException {
        Person p = new Person();
        p.setName("张三");
        p.setAge(18);
        p.setGender("man");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(p);
        System.out.println(json);
        //将数据存储在磁盘中
        objectMapper.writeValue(new File("G://a.txt"),p);
    }
    @Test
    public void fun2() throws IOException {
        Person p = new Person();
        p.setName("张三");
        p.setAge(18);
        p.setGender("man");
        p.setBirthday(new Date());
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(p);
        System.out.println(json);
        //将数据存储在磁盘中
//        objectMapper.writeValue(new File("G://a.txt"),p);
    }
    @Test
    public void fun3() throws IOException {
        Person p = new Person();
        p.setName("张三");
        p.setAge(18);
        p.setGender("man");
        p.setBirthday(new Date());
        Person p1 = new Person();
        p1.setName("张三1");
        p1.setAge(18);
        p1.setGender("man");
        p1.setBirthday(new Date());
        Person p2 = new Person();
        p2.setName("张三2");
        p2.setAge(18);
        p2.setGender("man");
        p2.setBirthday(new Date());
        List<Person> pList = new ArrayList<Person>();
        pList.add(p);
        pList.add(p1);
        pList.add(p2);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(pList);
        System.out.println(json);
        //将数据存储在磁盘中
//        objectMapper.writeValue(new File("G://a.txt"),p);
    }
}

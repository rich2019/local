package com.itheima.dao.impl;

import com.itheima.dao.PersonDao;
import com.itheima.domain.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    public List<Person> findAll() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:33060/test",
                "root","root");
        PreparedStatement pst = connection.prepareCall("select * from perosn");
        ResultSet re = pst.executeQuery();
        List<Person> list = new ArrayList<Person>();
        while(re.next()){
            Person p = new Person();
            p.setName(re.getString("name"));
            p.setAge(re.getInt("age"));
            list.add(p);
        }
        re.close();
        pst.close();
        connection.close();


        return list;
    }
}

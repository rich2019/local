package com.itheima.personTest;

import com.itheima.dao.PersonDao;
import com.itheima.dao.impl.PersonDaoImpl;
import com.itheima.domain.Person;
import org.junit.Test;

import java.util.List;

public class TestPerson {

    @Test
    public void findAll() throws Exception{
        PersonDao pd = new PersonDaoImpl();
        List<Person> listPerson = pd.findAll();
        for(Person p : listPerson){
            System.out.println(p.getName()+"   "+p.getAge());
        }
    }
}

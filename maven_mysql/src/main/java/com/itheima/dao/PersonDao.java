package com.itheima.dao;

import com.itheima.domain.Person;

import java.util.List;

public interface PersonDao {
    public List<Person> findAll() throws Exception;
}

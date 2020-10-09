package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;

import java.util.List;

public interface IOrdersService {


    List<Orders> findAll(int page,int size) throws Exception;

    public Orders findById(String ordersId) throws Exception;
}

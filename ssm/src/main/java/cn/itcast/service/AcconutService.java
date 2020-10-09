package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AcconutService {
    //查询所有账户
    public List<Account> findAll();

    //保存账户信息
    public void saveAcconut(Account account);
}

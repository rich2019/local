package zhongKong.dao;

import org.springframework.stereotype.Component;
import zhongKong.domain.Account;

import java.util.List;


public interface IAccountDao {
    List<Account> findAccount();

    Account findAccountById(Integer id);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void delAccount(Integer id);
}

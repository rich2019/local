package zhongKong.service;

import org.springframework.stereotype.Component;
import zhongKong.domain.Account;

import java.util.List;
public interface IAccountService {

    List<Account> findAccount();

    Account findAccountById(Integer id);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void delAccount(Integer id);

}

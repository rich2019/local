package zhongKong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zhongKong.dao.IAccountDao;
import zhongKong.domain.Account;
import zhongKong.service.IAccountService;

import java.util.List;
@Component("service")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    public List<Account> findAccount() {
        return accountDao.findAccount();
    }

    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void delAccount(Integer id) {
        accountDao.delAccount(id);
    }
}

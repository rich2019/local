package zhongKong.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zhongKong.dao.IAccountDao;
import zhongKong.domain.Account;

import java.sql.SQLException;
import java.util.List;
@Component("dao")
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private QueryRunner qr;

    public List<Account> findAccount() {
        try {
            return qr.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
           throw new RuntimeException(e);
        }
    }

    public Account findAccountById(Integer id) {
        try {
            return qr.query("select * from account where id=?",new BeanHandler<Account>(Account.class),id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveAccount(Account account) {
        try {
            qr.update("insert into account (name,value) values(?,?)",account.getName(),account.getMoney());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateAccount(Account account) {
        try {
            qr.update("update account name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delAccount(Integer id) {
        try {
            qr.update("delete from account where id =?",id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

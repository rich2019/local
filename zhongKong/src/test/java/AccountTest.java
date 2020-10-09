import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhongKong.domain.Account;
import zhongKong.service.IAccountService;

import java.util.List;

public class AccountTest {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService service = ac.getBean("service", IAccountService.class);
        List<Account> account = service.findAccount();
        System.out.println(account);
    }

    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService service = ac.getBean("service", IAccountService.class);
        Account account = service.findAccountById(2);
        System.out.println(account);
    }
}

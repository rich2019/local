package listenerPackage;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerTest implements javax.servlet.ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //服务器启动时调用
        System.out.println("服务器启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        //服务器关闭时调用
        System.out.println("服务器关闭");

    }
}

package cn.itcast.controller;

import cn.itcast.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.Map;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/params")
public class ParamController implements Serializable {

    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("你的用户名为:"+username);
        System.out.println("你的密码为:"+password);
        System.out.println("param run...");
        return "success";
    }
    @RequestMapping("/saveAccount")
    public String testAccount(Account a){
        System.out.println(a);
        return "success";
    }
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request);
        Map map = request.getParameterMap();
        System.out.println(map);
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));

        return "success";
    }
}

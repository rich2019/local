package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testAjax")
    public @ResponseBody User testJson(@RequestBody User user){
        System.out.println(user);
        user.setUsername("jerry");
        user.setPassword("678");
        user.setAge(88);
        return user;
    }
}

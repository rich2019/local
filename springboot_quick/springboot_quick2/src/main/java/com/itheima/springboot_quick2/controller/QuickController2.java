package com.itheima.springboot_quick2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController2 {

    @RequestMapping("quick2")
    @ResponseBody
    public String quick2(){
        return "<h1>你好,自动创建的springboot</h1>";
    }
}

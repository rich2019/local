package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class QuickController {

    @RequestMapping("/quick.do")
    @ResponseBody
    public String quick(){
        return "hello springboot 你好啊   ";
    }
}

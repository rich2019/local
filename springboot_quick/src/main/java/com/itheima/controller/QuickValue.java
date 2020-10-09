package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class QuickValue {


    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;

    @Value("${person.age}")
    private String age;



    @RequestMapping("quickValue")
    public String quick(){
        return name+"   "+addr+"   "+age;
    }
}

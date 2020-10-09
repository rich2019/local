package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/annotation")
public class AnnotationController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam() {
        System.out.println("request...");
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute() {
        System.out.println("testModerAttribute...");
        return "success";
    }

    @ModelAttribute
    public String show(){
        System.out.println("我总会执行show");
        return "model";
    }

    //model将值存储到request域中
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        model.addAttribute("msg","会哈");
        System.out.println("testSessionAttributes");
        return "model";
    }

}

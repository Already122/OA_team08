package com.gzf.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/index")
public class IndexController {
    @ResponseBody
    @RequestMapping("/json")
    public String json(){
        System.out.println("测试");
        return "测试返回json数据";
    }
    @RequestMapping("/jsp")
    public String jsp(){
        System.out.println("跳转页面");
        return "test";
    }
}
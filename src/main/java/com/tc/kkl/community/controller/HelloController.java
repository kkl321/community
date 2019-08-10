package com.tc.kkl.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 自动扫描，把它当成一个Spring 的Bean 扫描到容器中
 * 允许这个类接收前端的请求
 */
@Controller

public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
        return "hello";

    }
}

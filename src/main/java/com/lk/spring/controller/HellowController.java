package com.lk.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HellowController {

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello,Spring Boot";
    }
    @RequestMapping(value = "/success")
    public String success(Map<String,Object> map) {
        map.put("hello","hello");
        return "success";
    }
}

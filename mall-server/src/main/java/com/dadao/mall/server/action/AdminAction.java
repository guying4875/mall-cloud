package com.dadao.mall.server.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminAction {

    @RequestMapping("hi")
    public String hello(String name){
        return "hello "+name;
    }
}

package com.dadao.mall.web.admin.controller;

import com.dadao.mall.service.api.AdminFeignAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients(basePackages = "com.dadao.mall.service.admin.api")
public class AdminController {

    @Autowired
    AdminFeignAPI adminServiceAPI;

//    @Value("${jdbc.url:default value}")
//    String jdbcurl ;

    @GetMapping("queryadmin")
    public String queryAdmin(@RequestParam(value="id",defaultValue = "name is not null")String id){
        String s = adminServiceAPI.getAdmin(id);
        return s;

    }

    @GetMapping("/")
    public String index(){
        return "hello";
    }
}
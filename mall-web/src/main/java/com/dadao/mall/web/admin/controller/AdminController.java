package com.dadao.mall.web.admin.controller;

import com.dadao.mall.admin.model.Admin;
import com.dadao.mall.admin.service.api.AdminFeignAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    AdminFeignAPI adminServiceAPI;

//    @Value("${jdbc.url:default value}")
//    String jdbcurl ;

    @GetMapping("queryadmin")
    public Admin queryAdmin(@RequestParam(value="id",defaultValue = "name is not null")String id){

        return  adminServiceAPI.getAdmin(id);

    }

    @GetMapping("/")
    public String index(){
        return "hello";
    }
}

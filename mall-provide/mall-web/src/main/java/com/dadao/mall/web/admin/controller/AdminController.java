package com.dadao.mall.web.admin.controller;

import com.dadao.mall.web.admin.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    IAdminService adminService;

//    @Value("${jdbc.url:default value}")
//    String jdbcurl ;

    @GetMapping("queryadmin")
    public String queryAdmin(@RequestParam(value="id",defaultValue = "name is not null")String name){
        String s = adminService.queryAdminById(name);
        return s;

    }

    @GetMapping("/")
    public String index(){
        return "hello";
    }
}

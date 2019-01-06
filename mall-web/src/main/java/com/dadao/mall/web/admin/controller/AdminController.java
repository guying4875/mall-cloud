package com.dadao.mall.web.admin.controller;

import com.dadao.mall.web.admin.service.IAdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    IAdminService adminService;

    @GetMapping("queryadmin")
    public String queryAdminByName(@RequestParam(value="name")String name){
        String s = adminService.queryAdminByName(name);
        return s;

    }
}

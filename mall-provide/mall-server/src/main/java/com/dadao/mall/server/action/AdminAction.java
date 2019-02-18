package com.dadao.mall.server.action;

import com.dadao.mall.server.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController()
public class AdminAction {

    @Autowired
    AdminService adminService;

    @RequestMapping(value="/admin/{id}")
    public String getAdminName(@PathVariable("id") String id){
        log.debug("查询用户"+id);
        return adminService.getAdmin(id)+"  "+System.currentTimeMillis();
    }
}

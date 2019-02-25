package com.dadao.mall.provider.admin.service.impl;

import com.dadao.mall.admin.model.Admin;
import com.dadao.mall.provider.admin.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AdminServiceImpl implements AdminService {

    @Override
    public Admin getAdmin(String adminId) {
        log.debug(adminId);
        Admin admin = new Admin();
        admin.setId(adminId);
        return admin ;
    }
}


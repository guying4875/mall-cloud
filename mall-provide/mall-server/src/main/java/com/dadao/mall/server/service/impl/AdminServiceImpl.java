package com.dadao.mall.server.service.impl;

import com.dadao.mall.server.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AdminServiceImpl implements AdminService {

    @Override
    public String getAdmin(String adminId) {
        log.debug(adminId);
        return adminId ;
    }
}


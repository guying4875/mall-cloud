package com.dadao.mall.provider.user.service.impl;

import com.dadao.mall.provider.user.service.AdminService;
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


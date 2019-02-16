package com.dadao.mall.server.service;

import com.dadao.mall.service.api.AdminServiceAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * admin 服务类
 */
@Slf4j
@Service
public class AdminService implements AdminServiceAPI {
    @Override
    public String getAdminName(String adminId) {
        log.debug(adminId);
        return adminId ;
    }
}

package com.dadao.mall.provider.user.service;

import org.springframework.stereotype.Service;

/**
 * admin 服务类
 */
@Service
public interface AdminService  {
    /**
     * 根据id获取admin对象
     * @param adminId
     * @return
     */
    String getAdmin(String adminId);
}

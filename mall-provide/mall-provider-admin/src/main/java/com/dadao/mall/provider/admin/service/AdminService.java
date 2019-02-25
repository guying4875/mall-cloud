package com.dadao.mall.provider.admin.service;

import com.dadao.mall.admin.model.Admin;
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
    Admin getAdmin(String adminId);
}

package com.dadao.mall.web.admin.service.impl;


import com.dadao.mall.admin.model.Admin;
import com.dadao.mall.admin.service.api.AdminFeignAPI;
import com.dadao.mall.web.admin.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    AdminFeignAPI adminFeignAPI;
    @Override
    public Admin queryAdmin(String id) {
        return adminFeignAPI.getAdmin(id);
    }
}

package com.dadao.mall.web.admin.service;


import com.dadao.mall.admin.model.Admin;

/**
 * 获取用户信息
 */
public interface IAdminService {

    public Admin queryAdmin(String id);
}

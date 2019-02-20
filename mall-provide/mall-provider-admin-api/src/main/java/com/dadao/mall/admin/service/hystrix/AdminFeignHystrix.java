package com.dadao.mall.admin.service.hystrix;

import com.dadao.mall.admin.service.api.AdminFeignAPI;
import org.springframework.stereotype.Component;

@Component
public class AdminFeignHystrix implements AdminFeignAPI {

    @Override
    public String getAdmin(String id) {
        return null;
    }
}

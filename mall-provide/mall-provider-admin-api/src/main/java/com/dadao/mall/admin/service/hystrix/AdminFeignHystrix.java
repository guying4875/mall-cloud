package com.dadao.mall.admin.service.hystrix;

import com.dadao.mall.admin.model.Admin;
import com.dadao.mall.admin.service.api.AdminFeignAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AdminFeignHystrix implements AdminFeignAPI {

    @Override
    public Admin getAdmin(String id) {
        log.debug("熔断开启");
        return null;
    }
}

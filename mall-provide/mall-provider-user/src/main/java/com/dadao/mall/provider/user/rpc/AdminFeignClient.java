package com.dadao.mall.provider.user.rpc;

import com.dadao.mall.provider.user.service.AdminService;
import com.dadao.mall.service.api.AdminFeignAPI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign远程请求服务端 ---管理员远程调用类
 */
@RefreshScope
@RestController
@Slf4j
@Api(value = "API-AdminFeignClient" ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class AdminFeignClient implements AdminFeignAPI {
    @Autowired
    AdminService adminService;

    @Override
    @ApiOperation(httpMethod = "POST", value = "根据ID获取admin信息")
    public String getAdmin(String id) {
        log.debug("查询用户"+id);
        return adminService.getAdmin(id)+"  "+System.currentTimeMillis();
    }
}

package com.dadao.mall.server.rpc;

import com.dadao.mall.service.api.AdminFeignAPI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员远程调用类
 */
@RefreshScope
@RestController
@Api(value = "API-AdminFeignClient" ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class AdminFeignClient implements AdminFeignAPI {

    @Override
    @ApiOperation(httpMethod = "POST", value = "根据ID获取admin信息")
    public String getAdmin(String id) {
        return null;
    }
}

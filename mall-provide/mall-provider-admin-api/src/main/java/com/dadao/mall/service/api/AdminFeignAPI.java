package com.dadao.mall.service.api;

import com.dadao.mall.FeignConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 管理员信息远程调用接口类
 */
//value、name指定调用服务名称mall-server, path指定服务端访问的上下文名称为 mall-server
@FeignClient(name="mall-provider-user",configuration = FeignConfig.class)
@Api(value = "API-AdminFeignClient" ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public interface AdminFeignAPI {


    /**
     * 根据id查询admin
     * 指定调用服务的接口名称 ： /admin/{id}
     * @param id
     * @return
     */
    @ApiOperation(httpMethod = "POST", value = "根据ID获取admin信息")
    @ApiImplicitParam(name = "id",value="用户id",dataType = "String",required = true)
    @RequestMapping(value = "/api/admin/{id}",method = RequestMethod.POST)
    String getAdmin(@PathVariable("id") String id);
}

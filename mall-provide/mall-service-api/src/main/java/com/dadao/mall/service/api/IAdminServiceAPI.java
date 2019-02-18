package com.dadao.mall.service.api;

import com.dadao.mall.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 管理员服务类
 */
//value、name指定调用服务名称mall-server, path指定服务端访问的上下文名称为 mall-server
@FeignClient(name="mall-server",configuration = FeignConfig.class)
public interface IAdminServiceAPI {


    /**
     * 根据id查询admin
     * 指定调用服务的接口名称 ： /admin/{id}
     * @param id
     * @return
     */
    @RequestMapping(value = "/admin/{id}",method = RequestMethod.GET)
    String getAdmin(@PathVariable("id") String id);
}

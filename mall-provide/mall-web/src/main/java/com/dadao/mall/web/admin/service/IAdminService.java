package com.dadao.mall.web.admin.service;

import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

//value、name指定调用服务名称mall-server, path指定服务端访问的上下文名称为 mall-server
@FeignClient(value="mall-server",url = "http://localhost:8010",path="mall-server")
public interface IAdminService {

    /**
     * 根据id查询admin
     * 指定调用服务的接口名称 ： /admin/{id}
     * @param id
     * @return
     */
    @RequestMapping("/admin/{id}")
    @ResponseBody
    String queryAdminById(@PathVariable(value="id") String id);
}

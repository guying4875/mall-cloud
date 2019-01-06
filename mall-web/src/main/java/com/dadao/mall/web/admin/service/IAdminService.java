package com.dadao.mall.web.admin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="mall-server")
public interface IAdminService {

    /**
     * 根据id查询admin
     * @param name
     * @return
     */
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String queryAdminByName(@RequestParam(value="name") String name);
}

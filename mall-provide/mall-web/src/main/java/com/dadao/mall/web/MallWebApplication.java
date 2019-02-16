package com.dadao.mall.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//开发阶段关闭注册中心
@EnableEurekaClient
//开发阶段关闭自动发现
//@EnableDiscoveryClient
//开启feign
@EnableFeignClients
public class MallWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallWebApplication.class, args);
    }

}


package com.dadao.mall.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *  Feign是一个声明式的Web Service客户端，使用Feign来创建一个接口并用@FeignClient注解来配置它既可。
 *  * Spring Cloud为Feign增加了对Spring MVC注解的支持，
 *  还整合了Ribbon和Eureka来提供均衡负载的HTTP客户端实现。
 *  * 通过Feign远程服务调用，方便了各个服务之间的接口调用，就像调用本地方法一样。
 *
 */
@SpringBootApplication
//主要注册成为Eureka的一个客户端
@EnableDiscoveryClient
//开启feign
public class MallWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallWebApplication.class, args);
    }

}


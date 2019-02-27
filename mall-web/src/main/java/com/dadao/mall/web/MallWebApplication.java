package com.dadao.mall.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 *  Feign是一个声明式的Web Service客户端，使用Feign来创建一个接口并用@FeignClient注解来配置它既可。
 *  * Spring Cloud为Feign增加了对Spring MVC注解的支持，
 *  还整合了Ribbon和Eureka来提供均衡负载的HTTP客户端实现。
 *  * 通过Feign远程服务调用，方便了各个服务之间的接口调用，就像调用本地方法一样。
 *
 */
@SpringBootApplication(scanBasePackages = {"com.dadao.mall"})
//引入mall-provider-admin-api中组件的扫描路径
//@ComponentScan(basePackages = {"com.dadao.mall.admin"})
//主要注册成为Eureka的一个客户端
@EnableDiscoveryClient
//在feign客户端添加标记，该标记将会对mall-provider-admin-api中的@FeignClient起作用
//由于Feign服务端接口地址定义与启动类不在同一个包下因此需要指定feign组件的扫描路径
@EnableFeignClients(basePackages = {"com.dadao.mall.admin.service.api"})
public class MallWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallWebApplication.class, args);
    }

}


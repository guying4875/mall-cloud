package com.dadao.mall.provider.admin;

import com.dadao.mall.common.core.config.Swagger2Configure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
//指定spring扫描路径
@ComponentScan(basePackages = "com.dadao.mall.**")
//开启swagger2 自动构建API文档功能
@EnableSwagger2
//引入通用配置类
@Import(Swagger2Configure.class)
public class MallProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProviderUserApplication.class, args);
    }

}

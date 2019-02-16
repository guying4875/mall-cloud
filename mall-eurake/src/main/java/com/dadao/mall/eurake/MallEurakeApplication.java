package com.dadao.mall.eurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     //标记该服务为eureka服务端
public class MallEurakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallEurakeApplication.class, args);
    }

}


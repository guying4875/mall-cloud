package com.dadao.mall.disconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MallDisconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallDisconfigApplication.class, args);
    }

}


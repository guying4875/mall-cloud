package com.dadao.mall.provider.admin.config;

import com.dadao.mall.common.core.config.Swagger2Configure;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 */
@Configuration
//引入通用配置类中swagger2的配置内容
@Import(Swagger2Configure.class)
public class AdminConfig {
}

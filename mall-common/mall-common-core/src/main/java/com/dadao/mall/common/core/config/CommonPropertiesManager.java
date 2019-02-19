package com.dadao.mall.common.core.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import com.dadao.mall.common.core.constant.CommonConstant;

/**
 * mall common配置项管理类
 */
@Data
@ConfigurationProperties(prefix = CommonConstant.COMMON_PROPERTIES_PROFIX)
public class CommonPropertiesManager {
    private Swagger2Properties swagger2Properties = new Swagger2Properties();
}

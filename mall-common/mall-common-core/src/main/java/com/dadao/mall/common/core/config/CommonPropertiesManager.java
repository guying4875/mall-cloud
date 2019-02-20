package com.dadao.mall.common.core.config;


import com.dadao.mall.common.core.constant.CommonConstant;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * mall common配置项管理类
 */
@Component
@Data
@ConfigurationProperties(prefix = CommonConstant.COMMON_PROPERTIES_PROFIX)
public class CommonPropertiesManager {
    private Swagger2Properties swagger2Properties = new Swagger2Properties();
}

package com.dadao.mall.common.core.config;

import lombok.Data;

/**
 * swagger2 组建初始化构建参数
 */
@Data
public class Swagger2Properties {
    private String title;

    private String description;

    private String version = "1.0.0";

    private String license = "Apache License 2.0";

    private String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0";

    private String contactName = "忘幽";

    private String contactUrl = "http://paascloud.net";

    private String contactEmail = "zhjx2015@aliyun.com";
}

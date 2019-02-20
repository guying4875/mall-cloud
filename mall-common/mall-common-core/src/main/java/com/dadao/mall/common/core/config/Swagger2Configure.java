package com.dadao.mall.common.core.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

@EnableSwagger2
public class Swagger2Configure {

    @Resource
    private CommonPropertiesManager commonPropertiesManager;

    /**
     * 创建swagger2 API文档的docket
     * @return the docket
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                //配置鉴权信息
//                .securitySchemes(securitySchemes())
//                .securityContexts(securityContexts())
//				.globalOperationParameters(pars)
                .enable(true);
    }

    private ApiInfo apiInfo() {
        Swagger2Properties swagger = commonPropertiesManager.getSwagger2Properties();
        return new ApiInfoBuilder()
                .title(swagger.getTitle())
                .description(swagger.getDescription())
                .version(swagger.getVersion())
                .license(swagger.getLicense())
                .licenseUrl(swagger.getLicenseUrl())
                .contact(new Contact(swagger.getContactName(), swagger.getContactUrl(), swagger.getContactEmail()))
                .build();
    }

}

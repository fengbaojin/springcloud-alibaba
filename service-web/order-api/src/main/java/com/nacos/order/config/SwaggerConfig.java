package com.nacos.order.config;

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


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket webApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                //.groupName("system") // 组名
                .apiInfo(webApiInfo())
                //.host("8111") // 端口号
                .select()
                //.paths(Predicates.not(PathSelectors.regex("/admin/.*")))
                // 扫描的路径包
                .apis(RequestHandlerSelectors.basePackage("com.nacos.order"))
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // 指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any())
                .build();
    }


    // 自定义swagger数据源
    private ApiInfo webApiInfo() {
        return new ApiInfoBuilder()
                .title("mall_hch")
                .description("本文档描述了微服务各个模块接口定义")
                .version("1.0")
                .contact(new Contact("java", "", ""))
                .build();
    }
}

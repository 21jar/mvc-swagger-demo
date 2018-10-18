package com.ainijar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author slt
 * @date 2018/10/18
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("aa")
                .select()  // 选择那些路径和api会生成document
                .apis(RequestHandlerSelectors.basePackage("com.ainijar.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(userInfo());
    }

    private ApiInfo userInfo() {
        ApiInfo apiInfo = new ApiInfo("接口",
                "接口",
                "0.1",
                "北京",
                new Contact("slt", "", ""),
                "swagger url",
                ""
        );
        return apiInfo;
    }
}

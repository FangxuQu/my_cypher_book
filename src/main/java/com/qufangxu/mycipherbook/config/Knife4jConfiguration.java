package com.qufangxu.mycipherbook.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {

    @Bean(value = "defaultApi")
    public Docket defaultApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("My Cipher Book RESTful APIs")
                        .contact(new Contact("qufangxu","安徽省合肥市高新区", "2650955862@qq.com"))
                        .version("1.0")
                        .build())
                .groupName("1.X版本")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qufangxu.mycipherbook.cipher.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}

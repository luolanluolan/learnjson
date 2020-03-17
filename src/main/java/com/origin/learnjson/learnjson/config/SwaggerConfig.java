package com.origin.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableSwaggerBootstrapUi;
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

/**
 * - File Name:SwaggerConfig
 * - Description:   浏览器访问SwaggerBootstrapUi：http://localhost:8081/doc.html
 * - Functions:
 * - History:
 * Date         Author          Modification
 */
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUi
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.origin.json.app.signbook.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("签书API文档")
                .description("签书API文档")
                .termsOfServiceUrl("http://localhost:8081/swagger-ui.html")
                .contact(new Contact("", "http://localhost:8081/swagger-ui.html", ""))
                .version("V1.0")
                .build();
    }

}

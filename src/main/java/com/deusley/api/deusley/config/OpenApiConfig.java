package com.deusley.api.deusley.config;

import com.deusley.api.deusley.provider.model.ResponseErrorModel;
import com.fasterxml.classmate.TypeResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class OpenApiConfig {



        @Bean
        public Docket api(TypeResolver typeResolver) {
            return new Docket(DocumentationType.SWAGGER_2)
                    .additionalModels(
                            typeResolver.resolve(ResponseErrorModel.class))
                    .select()
                    .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                    .paths(PathSelectors.any())
                    .build()
                    .apiInfo(apiInfo());
        }


        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("Api - Endereços")
                    .version("1.0.0")
                    .contact(new Contact("Deusley Diego", "", "Deuslleyw@hotmail.com"))
                    .build();
        }

        @Bean
        public UiConfiguration uiConfig() {
            return UiConfigurationBuilder.builder()
                    .deepLinking(true)
                    .displayOperationId(false)
                    .showExtensions(false)
                    .filter(false)
                    .build();
        }
    }


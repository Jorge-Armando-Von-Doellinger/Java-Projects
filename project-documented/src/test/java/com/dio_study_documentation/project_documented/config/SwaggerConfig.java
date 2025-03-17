package com.dio_study_documentation.project_documented.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    // Bean para configurar a documentação da API usando OpenAPI 3
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Minha API")
                        .version("1.0")
                        .description("Documentação da API usando OpenAPI 3")
                        .contact(new Contact()
                                .name("Test - Documentation")
                                .url("http://www.test-documentation.com.br")
                                .email("null-mail@nullabla.null.nu"))
                );
    }
}

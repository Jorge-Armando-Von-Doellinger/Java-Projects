package com.dio_study_documentation.project_documented.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageSourceConfig {

    @Bean
    public MessageSource messageSource() {
        // Criando um ResourceBundleMessageSource
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        // Defina o nome do arquivo de configuração de mensagens
        // Aqui estamos usando application.properties como base para mensagens
        messageSource.setBasename("messages");
        return messageSource;
    }
}


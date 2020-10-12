package com.wolox.prueba.infrastructure.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
class RestTemplatePrueba {


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

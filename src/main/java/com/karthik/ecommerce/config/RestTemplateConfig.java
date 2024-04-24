package com.karthik.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    /** It will create the object and store it in application context  */
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

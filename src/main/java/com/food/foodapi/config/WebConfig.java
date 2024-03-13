package com.food.foodapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // 모든 origin을 허용하려면 "*"를 사용합니다. 필요에 따라 특정 origin을 지정할 수도 있습니다.
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 HTTP 메서드를 지정합니다.
                .allowedHeaders("*"); // 모든 헤더를 허용하려면 "*"를 사용합니다. 필요에 따라 특정 헤더를 지정할 수도 있습니다.
    }
}

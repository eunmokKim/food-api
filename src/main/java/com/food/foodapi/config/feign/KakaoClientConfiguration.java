package com.food.foodapi.config.feign;


import feign.Logger;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KakaoClientConfiguration {

    // Feign Client의 로깅 레벨 설정
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL; // 로깅 레벨은 필요에 따라 변경 가능합니다.
    }

    // Feign Client의 HTTP 헤더 설정
    @Bean
    public RequestInterceptor requestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate template) {
                template.header("Content-Type", "application/x-www-form-urlencoded");
                // 추가적인 헤더를 설정하려면 이곳에 추가합니다.
            }
        };

    }

}

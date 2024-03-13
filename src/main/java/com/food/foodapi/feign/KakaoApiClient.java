package com.food.foodapi.feign;

import com.food.foodapi.config.feign.KakaoClientConfiguration;
import com.food.foodapi.feign.res.KakaoUserInfoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "kakaoApiClient", url = "${kakao.api-host}", configuration = KakaoClientConfiguration.class)
public interface KakaoApiClient {

    @GetMapping(value = "${kakao.path.my-info}")
    KakaoUserInfoResponse getUserInfo(@RequestHeader("Authorization") String authValue);
}

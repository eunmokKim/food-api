package com.food.foodapi.feign;

import com.food.foodapi.config.feign.KakaoClientConfiguration;
import com.food.foodapi.feign.res.KakaoTokenResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "kakaoclient", url = "${kakao.host}", configuration = KakaoClientConfiguration.class)
public interface KakaoClient {

    @GetMapping(value = "${kakao.path.authorize}")
    void getAuthorizeCode(@RequestParam("client_id") String clientId,
                          @RequestParam("redirect_uri") String redirectUri,
                          @RequestParam("response_type") String responseType);

    @PostMapping(value = "${kakao.path.token}")
    KakaoTokenResponse getToken(@RequestParam("grant_type") String grantType,
                                @RequestParam("client_id") String clientId,
                                @RequestParam("redirect_uri") String redirect_uri,
                                @RequestParam("code") String code,
                                @RequestParam("client_secret") String clientSecret);

}

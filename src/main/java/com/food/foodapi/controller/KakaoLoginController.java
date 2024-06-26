package com.food.foodapi.controller;

import com.food.foodapi.command.LoginService;
import com.food.foodapi.query.res.KakaoUserInfoView;
import com.food.foodapi.feign.res.KakaoTokenResponse;
import com.food.foodapi.query.KakaoApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/kakao")
public class KakaoLoginController {
    private final KakaoApiService kakaoApiService;
    private final LoginService loginService;


    @GetMapping("/login")
    public String redirectLoginPage(){
        return kakaoApiService.getLoginUrl();
    }

    @GetMapping("/logout")
    public String redirectLogoutPage(){
        return kakaoApiService.getLogoutUrl();
    }

    @GetMapping("/login/callback")
    public KakaoUserInfoView redirectLoginCallback(@RequestParam("code") String code){
        KakaoTokenResponse tokenInfo = loginService.getToken(code);
        KakaoUserInfoView userInfo = loginService.getUserInfo(tokenInfo.getAccessToken());
        return KakaoUserInfoView.builder()
                .userEmail(userInfo.getUserEmail())
                .nickName(userInfo.getNickName())
                .accessToken(userInfo.getAccessToken())
                .refreshToken(tokenInfo.getRefreshToken())
                .build();
    }
}

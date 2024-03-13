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
        return kakaoApiService.requestGetAuthorizeCode();
    }

    @GetMapping("/login/callback")
    public KakaoUserInfoView redirectLoginCallback(@RequestParam("code") String code){
        KakaoTokenResponse response = loginService.getToken(code);
        return loginService.getUserInfo(response.getAccessToken());
    }
}

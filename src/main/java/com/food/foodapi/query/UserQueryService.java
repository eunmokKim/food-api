package com.food.foodapi.query;

import com.food.foodapi.feign.res.KakaoUserInfoResponse;
import com.food.foodapi.query.res.KakaoUserInfoView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserQueryService {
    private final KakaoApiService kakaoApiService;


    public KakaoUserInfoView getUserInfo(String accessToken){
        KakaoUserInfoResponse responseUserInfo = kakaoApiService.getUserInfo(accessToken);
        return KakaoUserInfoView.builder()
                .userEmail(responseUserInfo.getKakaoAccount().getEmail())
                .nickName(responseUserInfo.getKakaoAccount().getProfile().getNickname())
                .accessToken(accessToken)
                .build();
    }


}

package com.food.foodapi.query.res;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class KakaoUserInfoView {
    private String accessToken;
    private String refreshToken;
    private String nickName;
    private String userEmail;
}

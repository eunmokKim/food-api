package com.food.foodapi.command;

import com.food.foodapi.command.dto.TokenInfoCommand;
import com.food.foodapi.command.dto.UsersCommand;
import com.food.foodapi.feign.res.KakaoTokenResponse;
import com.food.foodapi.query.KakaoApiService;
import com.food.foodapi.query.UserQueryService;
import com.food.foodapi.query.res.KakaoUserInfoView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final KakaoApiService kakaoApiService;
    private final UserCommandService userCommandService;
    private final UserQueryService userQueryService;


    public KakaoTokenResponse getToken(final String code){
        KakaoTokenResponse response = kakaoApiService.getToken(code);
        userCommandService.registerTokenInfo(
                TokenInfoCommand.builder()
                        .authCode(code)
                        .accessToken(response.getAccessToken())
                        .expiresIn(response.getExpiresIn())
                        .refreshToken(response.getRefreshToken())
                        .refreshTokenExpiresIn(response.getRefreshTokenExpiresIn())
                        .build());
        return response;
    }

    public KakaoUserInfoView getUserInfo(String accessToken){
        KakaoUserInfoView response = userQueryService.getUserInfo(accessToken);
        userCommandService.registerUsers(UsersCommand.builder()
                        .userEmail(response.getUserEmail())
                        .nickName(response.getNickName())
                .build());
        return response;
    }
}

package com.food.foodapi.query;

import com.food.foodapi.feign.KakaoApiClient;
import com.food.foodapi.feign.KakaoClient;
import com.food.foodapi.feign.res.KakaoTokenResponse;
import com.food.foodapi.feign.res.KakaoUserInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KakaoApiService {
    @Value(value = "${kakao.host}")
    private String host;
    @Value(value = "${kakao.path.authorize}")
    private String authorizePath;
    @Value(value = "${kakao.client-id}")
    private String clientId;
    @Value(value = "${kakao.redirect-url}")
    private String redirectUrl;
    @Value(value = "${kakao.redirect-main-url}")
    private String redirectMainUrl;
    @Value(value = "${kakao.client-secret}")
    private String clientSecret;

    private final KakaoClient kakaoClient;
    private final KakaoApiClient kakaoApiClient;


    public HttpHeaders redirectHeader(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", this.requestGetAuthorizeCode());
        return headers;
    }

    public HttpHeaders redirectMainHeader(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", redirectMainUrl);
        return headers;
    }

    public String requestGetAuthorizeCode(){
        String param = String.join("&",  "client_id=" + clientId, "redirect_uri=" + redirectUrl, "response_type=code");
        return host.concat(authorizePath).concat("?").concat(param);
    }

    public KakaoTokenResponse getToken(String code){
        return kakaoClient.getToken("authorization_code",
                clientId,
                redirectUrl,
                code,
                clientSecret);
    }

    public KakaoUserInfoResponse getUserInfo(String accessToken){
        return kakaoApiClient.getUserInfo("Bearer " + accessToken);
    }
}

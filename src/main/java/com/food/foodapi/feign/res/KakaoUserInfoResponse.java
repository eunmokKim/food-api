package com.food.foodapi.feign.res;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class KakaoUserInfoResponse {
    private Long id;
    private Boolean hasSignedUp;
    private LocalDateTime connectedAt;
    private LocalDateTime synchedAt;
//    private Json
    private KakaoAccount kakaoAccount;//계정정보
//    private ForPartner
}

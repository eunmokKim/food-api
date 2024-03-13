package com.food.foodapi.feign.res;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class KakaoAccount {
    private boolean profileNeedsAgreement;
    private boolean profileNicknameNeedsAgreement;
    private boolean profileImageNeedsAgreement;
    private Profile profile;
    private boolean nameNeedsAgreement;
    private String name;
    private boolean emailNeedsAgreement;
    private boolean isEmailValid;
    private boolean isEmailVerified;
    private String email;

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Profile {
        private String nickname;
        private String thumbnailImageUrl;
        private String profileImageUrl;
        private Boolean isDefaultImage;
    }
}

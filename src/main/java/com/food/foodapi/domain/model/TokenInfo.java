package com.food.foodapi.domain.model;


import com.food.foodapi.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "token_info")
public class TokenInfo extends BaseEntity {
    @Column(name = "access_token", nullable = false, length = 100)
    private String accessToken;

    @Column(name = "expires_in", nullable = false)
    private Integer expiresIn;

    @Column(name = "refresh_token", nullable = false, length = 100)
    private String refreshToken;

    @Column(name = "refresh_token_expires_in", nullable = false)
    private Integer refreshTokenExpiresIn;

    @Column(name = "auth_code", nullable = false, length = 100)
    private String authCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;
}

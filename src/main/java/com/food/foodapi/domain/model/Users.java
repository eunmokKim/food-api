package com.food.foodapi.domain.model;

import com.food.foodapi.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class Users extends BaseEntity {

    @Column(name = "user_email", nullable = false, unique = true, length = 100)
    private String userEmail;

    @Column(name = "nick_name", nullable = false, length = 20)
    private String nickName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
    private List<TokenInfo> tokenInfos = new ArrayList<>();
}

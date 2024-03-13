package com.food.foodapi.domain.repository;

import com.food.foodapi.domain.model.TokenInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenInfoRepository extends JpaRepository<TokenInfo, Long> {
}

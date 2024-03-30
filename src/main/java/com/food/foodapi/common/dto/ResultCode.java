package com.food.foodapi.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
    SUCCESS("100"),
    ERROR("600");

    private final String code;


}

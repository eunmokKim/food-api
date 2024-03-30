package com.food.foodapi.domain.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum Category {
    FOOD("음식"),
    ALCOHOL("주류"),
    BEVERAGE("음료"),
    DESSERT("디저트");

    private String name;
}

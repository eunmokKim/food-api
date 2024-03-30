package com.food.foodapi.command.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductsCommand {
    private String name;
    private Integer price;
    private String imgPath;
    @NotBlank(message = "필수입력입니다.")
    private String category;
}

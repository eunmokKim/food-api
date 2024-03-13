package com.food.foodapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Setter
@Getter
public class RegionDTO {
    @NotEmpty(message = "zip_code는 필수입력입니다.")
    @JsonProperty("zip_code")
    private String zipCode;
}

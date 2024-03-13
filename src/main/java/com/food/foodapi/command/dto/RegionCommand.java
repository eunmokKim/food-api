package com.food.foodapi.command.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegionCommand {
    private String zipCode;
}

package com.food.foodapi.command.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoodReviewCommand {
    private String title;
    private String contents;
    private String thumbnailPath;
    private String shortsPath;
    private String region;
    private Float latitude;
    private Float longitude;
    private String zipCode;
}

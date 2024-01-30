package com.food.foodapi.command.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FoodReviewCommand {
    private String title;
    private String contents;
    private String thumbnailPath;
    private String shortsPath;
    private String region;
    private Float latitude;
    private Float longitude;
}

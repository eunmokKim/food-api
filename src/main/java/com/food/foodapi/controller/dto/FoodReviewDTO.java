package com.food.foodapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FoodReviewDTO {
    private MultipartFile thumbnail;
    private MultipartFile fileList;
    private String region;
    private Float latitude;
    private Float longitude;
    @JsonProperty("zip_code")
    private String zipCode;
    private String title;
    private String contents;

}

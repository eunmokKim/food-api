package com.food.foodapi.controller;

import com.food.foodapi.command.UserCommandService;
import com.food.foodapi.command.dto.FoodReviewCommand;
import com.food.foodapi.common.dto.ApiResponse;
import com.food.foodapi.controller.dto.FoodReviewDTO;
import com.food.foodapi.controller.dto.RegionDTO;
import com.food.foodapi.query.UserQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserQueryService userQueryService;
    private final UserCommandService userCommandService;


    @PostMapping("/food_review")
    public ApiResponse foodReview(@RequestBody FoodReviewDTO dto){
        userCommandService.registerReview(FoodReviewCommand.builder()
                .region(dto.getRegion())
                .title(dto.getTitle())
                .contents(dto.getContents())
                .zipCode(dto.getZipCode())
                .build());
        return ApiResponse.createCompleted();
    }

    /*@PostMapping("/region")
    public ApiResponse registerRegion(@Valid @RequestBody RegionDTO regionDTO){

    }*/

}

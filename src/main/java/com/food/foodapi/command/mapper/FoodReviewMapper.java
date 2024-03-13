package com.food.foodapi.command.mapper;

import com.food.foodapi.command.dto.FoodReviewCommand;
import com.food.foodapi.common.mapper.GenericMapper;
import com.food.foodapi.domain.model.FoodReview;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FoodReviewMapper extends GenericMapper<FoodReviewCommand, FoodReview> {
}
package com.food.foodapi.command.mapper;

import com.food.foodapi.command.dto.FoodReviewCommand;
import com.food.foodapi.common.mapper.GenericMapper;
import com.food.foodapi.domain.model.FoodReview;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FoodReviewMapper extends GenericMapper<FoodReview, FoodReviewCommand> {
//    FoodReviewCommand entityToDTO(FoodReview source);
//    FoodReview dtoToEntity(FoodReviewCommand source);
}
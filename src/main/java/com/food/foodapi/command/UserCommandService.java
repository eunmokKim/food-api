package com.food.foodapi.command;

import com.food.foodapi.command.dto.FoodReviewCommand;
import com.food.foodapi.command.mapper.FoodReviewMapper;
import com.food.foodapi.domain.model.FoodReview;
import com.food.foodapi.domain.repository.FoodReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserCommandService {
    private final FoodReviewRepository foodReviewRepository;
    private final FoodReviewMapper foodReviewMapper;


    public void save(FoodReviewCommand command){
        foodReviewRepository.save(foodReviewMapper.dtoToEntity(command));
    }
}

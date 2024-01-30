package com.food.foodapi.domain.repository;

import com.food.foodapi.domain.model.FoodReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodReviewRepository extends JpaRepository<FoodReview, Long> {
}

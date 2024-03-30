package com.food.foodapi.domain.repository;

import com.food.foodapi.domain.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}

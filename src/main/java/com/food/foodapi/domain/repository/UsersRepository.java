package com.food.foodapi.domain.repository;

import com.food.foodapi.domain.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByUserEmail(String userEmail);
}

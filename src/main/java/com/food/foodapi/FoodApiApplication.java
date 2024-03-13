package com.food.foodapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FoodApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodApiApplication.class, args);
    }

}

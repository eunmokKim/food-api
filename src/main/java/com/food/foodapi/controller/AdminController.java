package com.food.foodapi.controller;

import com.food.foodapi.command.AdminCommandService;
import com.food.foodapi.command.dto.ProductsCommand;
import com.food.foodapi.common.dto.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RequestMapping("/api/admin")
@RestController
@RequiredArgsConstructor
public class AdminController {
    private final AdminCommandService adminCommandService;


    @PostMapping("/registerProducts")
    public ApiResponse registerProducts(@Valid @RequestBody ProductsCommand command) {
        adminCommandService.registerProduct(command);

        return ApiResponse.createCompleted();
    }
}

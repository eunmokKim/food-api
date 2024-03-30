package com.food.foodapi.command;

import com.food.foodapi.command.dto.ProductsCommand;
import com.food.foodapi.command.mapper.ProductsMapper;
import com.food.foodapi.domain.model.Products;
import com.food.foodapi.domain.repository.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminCommandService {
    private final ProductsRepository productsRepository;


    public void registerProduct(ProductsCommand command){
        Products products = ProductsMapper.INSTANCE.dtoToEntity(command);
        productsRepository.save(products);
    }
}

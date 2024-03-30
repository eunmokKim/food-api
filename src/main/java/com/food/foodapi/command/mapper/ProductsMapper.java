package com.food.foodapi.command.mapper;

import com.food.foodapi.command.dto.ProductsCommand;
import com.food.foodapi.domain.code.Category;
import com.food.foodapi.domain.model.Products;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductsMapper {
    ProductsMapper INSTANCE = Mappers.getMapper(ProductsMapper.class);

    @Mapping(source = "category", target = "category", qualifiedByName = "categoryToString")
    ProductsCommand entityToDTO(Products products);

    @Mapping(source = "category", target = "category", qualifiedByName = "stringToCategory")
    Products dtoToEntity(ProductsCommand productsCommand);

    @Named("categoryToString")
    default String categoryToString(Category category) {
        return category != null ? category.name() : null;
    }

    @Named("stringToCategory")
    default Category stringToCategory(String category) {
        return category != null ? Category.valueOf(category) : null;
    }
}

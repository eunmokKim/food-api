package com.food.foodapi.common.mapper;

public interface GenericMapper<DTO, E> {

    E entityToDTO(DTO source);

    DTO dtoToEntity(E source);

}



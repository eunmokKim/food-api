package com.food.foodapi.common.mapper;

public interface GenericMapper<DTO, E> {

    DTO entityToDTO(E source);

    E dtoToEntity(DTO source);

}



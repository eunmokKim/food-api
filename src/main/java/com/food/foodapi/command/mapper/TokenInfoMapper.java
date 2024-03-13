package com.food.foodapi.command.mapper;

import com.food.foodapi.command.dto.TokenInfoCommand;
import com.food.foodapi.common.mapper.GenericMapper;
import com.food.foodapi.domain.model.TokenInfo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TokenInfoMapper extends GenericMapper<TokenInfoCommand, TokenInfo> {
}

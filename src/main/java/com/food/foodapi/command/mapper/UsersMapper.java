package com.food.foodapi.command.mapper;

import com.food.foodapi.command.dto.UsersCommand;
import com.food.foodapi.common.mapper.GenericMapper;
import com.food.foodapi.domain.model.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsersMapper extends GenericMapper<UsersCommand, Users> {
}

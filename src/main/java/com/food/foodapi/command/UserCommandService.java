package com.food.foodapi.command;

import com.food.foodapi.command.dto.FoodReviewCommand;
import com.food.foodapi.command.dto.TokenInfoCommand;
import com.food.foodapi.command.dto.UsersCommand;
import com.food.foodapi.command.mapper.FoodReviewMapper;
import com.food.foodapi.command.mapper.TokenInfoMapper;
import com.food.foodapi.command.mapper.UsersMapper;
import com.food.foodapi.domain.model.Users;
import com.food.foodapi.domain.repository.FoodReviewRepository;
import com.food.foodapi.domain.repository.TokenInfoRepository;
import com.food.foodapi.domain.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
@Transactional
@RequiredArgsConstructor
public class UserCommandService {
    private final FoodReviewRepository foodReviewRepository;
    private final FoodReviewMapper foodReviewMapper;
    private final UsersRepository usersRepository;
    private final UsersMapper usersMapper;
    private final TokenInfoRepository tokenInfoRepository;
    private final TokenInfoMapper tokenInfoMapper;


    public void registerReview(FoodReviewCommand command){
        foodReviewRepository.save(foodReviewMapper.dtoToEntity(command));
    }

    public void registerTokenInfo(TokenInfoCommand command){
        tokenInfoRepository.save(tokenInfoMapper.dtoToEntity(command));
    }

    public Users registerUsers(UsersCommand command){
        Users findUser = usersRepository.findByUserEmail(command.getUserEmail());

        if(Objects.isNull(findUser)){
            Users users = usersRepository.save(usersMapper.dtoToEntity(command));
        }

        return findUser;
    }
}

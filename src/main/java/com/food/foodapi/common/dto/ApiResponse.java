package com.food.foodapi.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    private ResultCode resultCode;
    private String resultMessage;


    public static ApiResponse ok(){
        return ApiResponse.builder()
                .resultCode(ResultCode.SUCCESS)
                .resultMessage("")
                .build();
    }

    public static ApiResponse createCompleted(){
        return ApiResponse.builder()
                .resultCode(ResultCode.SUCCESS)
                .resultMessage("Succeed Input Data")
                .build();
    }

    public static ApiResponse error(String msg){
        return ApiResponse.builder()
                .resultCode(ResultCode.ERROR)
                .resultMessage(msg)
                .build();
    }


}

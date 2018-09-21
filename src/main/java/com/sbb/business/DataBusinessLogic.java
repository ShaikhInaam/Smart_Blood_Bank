package com.sbb.business;


import com.sbb.dto.DataDTO;
import com.sbb.dto.response.RestResponseDto;

public interface  DataBusinessLogic{

    RestResponseDto saveData(DataDTO dataDTO);
    RestResponseDto getData();

}
package com.sbb.business;

import com.sbb.dto.DataDTO;
import com.sbb.dto.response.RestResponseDto;
import com.sbb.entity.Data;
import com.sbb.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class DataBusinessLogicImpl implements DataBusinessLogic{

    @Autowired
    DataService dataService;

    @Override
    public RestResponseDto saveData(DataDTO dataDTO) {

        Data data=new Data(dataDTO);
        RestResponseDto restResponseDto=new RestResponseDto();
        dataService.saveData(data);
        restResponseDto.makeSuccessResponse();

        return restResponseDto;
    }

    @Override
    public RestResponseDto getData(){

        RestResponseDto restResponseDto=new RestResponseDto();
        List<Data> dataList=  dataService.getData();
        restResponseDto.makeSuccessResponse(dataList);

        return restResponseDto;
    }

}
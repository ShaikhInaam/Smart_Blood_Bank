package com.sbb.rest;


import com.sbb.business.DataBusinessLogic;
import com.sbb.dto.DataDTO;
import com.sbb.dto.constant.Error;
import com.sbb.dto.response.RestResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataRestController {

    @Autowired
    DataBusinessLogic dataBusinessLogic;

    @PostMapping("/send")
    public RestResponseDto setData(@RequestBody DataDTO data)
    {

        RestResponseDto restResponseDto = new RestResponseDto();
        try {
            restResponseDto = dataBusinessLogic.saveData(data);
            restResponseDto.makeSuccessResponse(data);

        }catch (Exception ex){
            restResponseDto.makeFailureResponse(Error.INTERNAL_SERVER_ERROR);
        }

        return restResponseDto;
    }

    @GetMapping("/get")
    public RestResponseDto getData(){

        RestResponseDto restResponseDto = new RestResponseDto();
        try {
            restResponseDto = dataBusinessLogic.getData();
        }catch (Exception ex){
            restResponseDto.makeFailureResponse(Error.INTERNAL_SERVER_ERROR);
        }

        return restResponseDto;
    }

    @GetMapping("/hello")
    public String sayHello(){

        return "Hello from Data Rest Controller";
    }


}

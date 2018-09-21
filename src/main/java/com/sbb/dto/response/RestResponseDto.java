package com.sbb.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbb.dto.constant.Error;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
public class RestResponseDto<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private HttpStatus status = HttpStatus.OK;
    private T data;
    private List<com.sbb.dto.response.ErrorDto> errors = new ArrayList<>();
    private Boolean success;


    public RestResponseDto() {
        setSuccess(false);
    }

    public void makeFailureResponse(Error error) {
        this.makeFailureResponse(error, HttpStatus.OK);
    }

    public void makeFailureResponse(Error error, HttpStatus status) {

        List<ErrorDto> errorList = new ArrayList<>();
        errorList.add(new ErrorDto(error));
        setErrors(errorList);
        setStatus(status);
        setSuccess(Boolean.FALSE);
    }



    public void makeSuccessResponse(T data) {
        this.makeSuccessResponse(data, HttpStatus.OK);
    }

    public void makeSuccessResponse() {
        this.makeSuccessResponse(HttpStatus.OK);
    }

    public void makeSuccessResponse(HttpStatus status) {

        setSuccess(true);
        setStatus(status);
    }


    public void makeSuccessResponse(T data, HttpStatus status) {

        setSuccess(true);
        setStatus(status);
        System.out.println(data);
        setData(data);
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    private void setSuccess(boolean success) {

        this.success = success;
    }

}

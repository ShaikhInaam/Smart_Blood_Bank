package com.sbb.dto.response;

import lombok.Data;

@Data
public class ErrorDto {

    private String errorCode;
    private String errorMessage;
    private String errorDetails;

    public ErrorDto() {}

    public ErrorDto(String errorCode, String errorMessage, String errorDetails) {

        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorDetails = errorDetails;
    }

    public ErrorDto(com.sbb.dto.constant.Error error) {

        this.errorCode = error.getCode();
        this.errorMessage = error.getMessage();
        this.errorDetails = error.getMessage();
    }

    public ErrorDto(com.sbb.dto.constant.Error error, String errorDetails) {

        this.errorCode = error.getCode();
        this.errorMessage = error.getMessage();
        this.errorDetails = errorDetails;
    }

    @Override
    public String toString() {

        return "ErrorDto [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", errorDetails=" + errorDetails + "]";
    }

}

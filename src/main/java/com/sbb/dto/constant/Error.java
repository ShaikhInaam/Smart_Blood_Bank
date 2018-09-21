package com.sbb.dto.constant;


public enum Error {

    AUTHENTICATION_ERROR("1", "Invalid access token"),
    INTERNAL_SERVER_ERROR("2", "Something wrong happened with the application. Please try again later.");


    private final String code;
    private final String message;

    Error(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}

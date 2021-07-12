package com.example.project.exception;

public class MyCustomException extends Exception{
    private String message;
    public MyCustomException(String message) {
        this.message=message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}


package com.itheima.demo04.MyException;

public class RegisterException extends RuntimeException{
    public RegisterException() {

    }
    public RegisterException(String message) {
        super(message);
    }
}

package com.work.ruslan.testrestful.exception;

public class UserNotFoundException extends  Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}

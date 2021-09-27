package com.work.ruslan.testrestful.controller;

import com.work.ruslan.testrestful.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;


class UserControllerTest {
    @Test
    void registration() {
        UserController userController = new UserController();
        ResponseEntity responseEntity = userController.registration(new UserEntity());
        assertEquals("<400 BAD_REQUEST Bad Request,Error,[]>", responseEntity.toString());
    }

    @Test
    void getOneUser() {
        UserController userController = new UserController();
        Long number = new Long(3);
        ResponseEntity responseEntity = userController.getOneUser(number);
        assertEquals("<400 BAD_REQUEST Bad Request,Error,[]>", responseEntity.toString());

    }
}
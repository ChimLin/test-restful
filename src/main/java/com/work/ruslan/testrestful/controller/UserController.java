package com.work.ruslan.testrestful.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public ResponseEntity getUser(){
        try {
            return ResponseEntity.ok("working");
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
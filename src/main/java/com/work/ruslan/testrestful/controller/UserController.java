package com.work.ruslan.testrestful.controller;

import com.work.ruslan.testrestful.entity.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user){
        try {
            return ResponseEntity.ok("working");
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping("/")
    public ResponseEntity getUser(){
        try {
            return ResponseEntity.ok("working");
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
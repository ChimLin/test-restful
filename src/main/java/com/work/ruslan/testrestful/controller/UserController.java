package com.work.ruslan.testrestful.controller;

import com.work.ruslan.testrestful.entity.UserEntity;
import com.work.ruslan.testrestful.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user){
        try {
            userRepo.save(user);
            return ResponseEntity.ok("user was added");
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping
    public ResponseEntity getOneUser(@RequestBody Long id){
        if(userRepo.findById(id).get() == null){

        }
        return ResponseEntity.badRequest().body("Error");
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
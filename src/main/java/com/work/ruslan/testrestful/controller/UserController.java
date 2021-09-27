package com.work.ruslan.testrestful.controller;

import com.work.ruslan.testrestful.entity.UserEntity;
import com.work.ruslan.testrestful.exception.UserNotFoundException;
import com.work.ruslan.testrestful.repository.UserRepo;
import com.work.ruslan.testrestful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user){
        try {
            userService.registration(user);
            return ResponseEntity.ok("user was added");
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Error! Email is invalid");
        }
    }

    @GetMapping
    public ResponseEntity getOneUser(@RequestParam Long id){
        try {
            return ResponseEntity.ok(userService.getOne(id));
        }catch (UserNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

}
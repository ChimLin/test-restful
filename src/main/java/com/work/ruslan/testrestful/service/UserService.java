package com.work.ruslan.testrestful.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.work.ruslan.testrestful.entity.UserEntity;
import com.work.ruslan.testrestful.exception.UserNotFoundException;
import com.work.ruslan.testrestful.repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserEntity registration(UserEntity user) throws IllegalArgumentException{
        if (!isEmailValid(user.getEmail())){
            throw new IllegalArgumentException("email is invalid");
        }
        return userRepo.save(user);
    }

    public boolean isEmailValid(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public UserEntity getOne(Long id) throws UserNotFoundException {
        UserEntity userEntity = userRepo.findById(id).get();
        if( userEntity == null){
            throw new UserNotFoundException("user was not founded");
        }
        return userEntity;
    }
}

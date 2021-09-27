package com.work.ruslan.testrestful.service;

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

    public UserEntity registration(UserEntity user){
        return userRepo.save(user);
    }

    public UserEntity getOne(Long id) throws UserNotFoundException {
        UserEntity userEntity = userRepo.findById(id).get();
        if( userEntity == null){
            throw new UserNotFoundException("user was not founded");
        }
        return userEntity;
    }
}

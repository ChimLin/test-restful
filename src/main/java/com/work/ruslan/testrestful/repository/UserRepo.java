package com.work.ruslan.testrestful.repository;

import com.work.ruslan.testrestful.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
}

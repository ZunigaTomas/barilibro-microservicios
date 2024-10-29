package com.zunigatomas.barilibro.user_service.repository;

import com.zunigatomas.barilibro.user_service.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}

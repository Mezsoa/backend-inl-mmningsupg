package com.inlamningsuppgift.backend.Repository;

import com.inlamningsuppgift.backend.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}

package com.inlamningsuppgift.backend.Repository;

import com.inlamningsuppgift.backend.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, String> {

}

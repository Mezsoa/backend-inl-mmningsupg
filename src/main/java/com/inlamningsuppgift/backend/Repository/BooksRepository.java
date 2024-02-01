package com.inlamningsuppgift.backend.Repository;

import com.inlamningsuppgift.backend.models.Books;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksRepository extends MongoRepository<Books, String> {
}

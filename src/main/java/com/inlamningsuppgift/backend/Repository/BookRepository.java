package com.inlamningsuppgift.backend.Repository;

import com.inlamningsuppgift.backend.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface BookRepository extends MongoRepository<Book, String> {
}

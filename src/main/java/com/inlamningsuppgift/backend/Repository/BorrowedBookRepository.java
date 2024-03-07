package com.inlamningsuppgift.backend.Repository;

import com.inlamningsuppgift.backend.models.BorrowedBook;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BorrowedBookRepository extends MongoRepository<BorrowedBook, String> {

}

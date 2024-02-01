package com.inlamningsuppgift.backend.Repository;

import com.inlamningsuppgift.backend.models.BorrowedBooks;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BorrowedBooksRepository extends MongoRepository<BorrowedBooks, String> {

}

package com.inlamningsuppgift.backend.Services;

import com.inlamningsuppgift.backend.Repository.BookRepository;
import com.inlamningsuppgift.backend.Repository.BorrowedBookRepository;
import com.inlamningsuppgift.backend.Repository.UserRepository;
import com.inlamningsuppgift.backend.dto.BorrowedBookDTO;
import com.inlamningsuppgift.backend.models.Book;
import com.inlamningsuppgift.backend.models.BorrowedBook;
import com.inlamningsuppgift.backend.models.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class BorrowedBookService {

    @Autowired
    BorrowedBookRepository borrowedBookRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    UserRepository userRepository;

    public BorrowedBook createBorrowedBook(BorrowedBookDTO borrowedBookDTO) {
        User findUser = userRepository.findById(borrowedBookDTO.getUserId())
                .orElseThrow(() -> new RuntimeException("User was not found"));
        Book findBook = bookRepository.findById(borrowedBookDTO.getBookId())
                .orElseThrow(() -> new RuntimeException("book was not found"));

    }


}

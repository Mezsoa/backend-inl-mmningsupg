package com.inlamningsuppgift.backend.Services;

import com.inlamningsuppgift.backend.Repository.BorrowedBooksRepository;
import com.inlamningsuppgift.backend.Repository.UsersRepository;
import com.inlamningsuppgift.backend.models.Books;
import com.inlamningsuppgift.backend.models.BorrowedBooks;
import com.inlamningsuppgift.backend.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class BorrowedBooksService {

    @Autowired
    private UsersService usersService;

    @Autowired
    BorrowedBooksRepository borrowedBooksRepository;

    public BorrowedBooks createBorrowedBooks(BorrowedBooks borrowedBooks) {
        return borrowedBooksRepository.save(borrowedBooks);
    }

    public List<BorrowedBooks> getAllBorrowedBooks() {
        return borrowedBooksRepository.findAll();
    }

    public BorrowedBooks getOneBorrowedBook(String id) {
        return borrowedBooksRepository.findById(id).get();
    }

    public BorrowedBooks updateBorrowedBooks(String _id, BorrowedBooks borrowedBooks) {
        return borrowedBooksRepository.save(borrowedBooks);
    }

    public BorrowedBooks deleteAll() {
        borrowedBooksRepository.deleteAll();
        return null;
    }

    public String deleteBorrowedBooks(String id) {
        borrowedBooksRepository.deleteById(id);
        return "Deleted successfully!";
    }
}

package com.inlamningsuppgift.backend.Services;

import com.inlamningsuppgift.backend.Repository.BookRepository;
import com.inlamningsuppgift.backend.Repository.BorrowedBookRepository;
import com.inlamningsuppgift.backend.Repository.UserRepository;
import com.inlamningsuppgift.backend.dto.BorrowedBook.BorrowedBookDTO;
import com.inlamningsuppgift.backend.dto.BorrowedBook.BorrowedBookFoundByIdDTO;
import com.inlamningsuppgift.backend.dto.BorrowedBook.UpdateOneBorrowedBookDTO;
import com.inlamningsuppgift.backend.models.Book;
import com.inlamningsuppgift.backend.models.BorrowedBook;
import com.inlamningsuppgift.backend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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

            BorrowedBook newBorrowedBook = new BorrowedBook();
                newBorrowedBook.setUser(findUser);
                newBorrowedBook.setBook(findBook);
                newBorrowedBook.setBorrowedDate(borrowedBookDTO.getBorrowedDate());
                newBorrowedBook.setDueDate(borrowedBookDTO.getDueDate());

                return borrowedBookRepository.save(newBorrowedBook);
    }


    public List<BorrowedBook> getAllBorrowedBook() {
        return borrowedBookRepository.findAll();
    }


    public Optional<BorrowedBook> getOneBorrowedBook(BorrowedBookFoundByIdDTO borrowedBookFoundByIdDTO) {
        return borrowedBookRepository.findById(borrowedBookFoundByIdDTO.getBorrowedBookId());
    }

    public BorrowedBook updateBorrowedBook(UpdateOneBorrowedBookDTO updateOneBorrowedBookDTO) {
        return borrowedBookRepository.findById(updateOneBorrowedBookDTO.getBorrowedBookId())
                .map(existingBorrowedBook -> {
                    if (updateOneBorrowedBookDTO.getUserId() != null) {
                        existingBorrowedBook.setUser(updateOneBorrowedBookDTO.getUserId());
                    }
                    if (updateBorrowedBook.getBook() != null) {
                        existingBorrowedBook.setBook(updateBorrowedBook.getBook());
                    }
                    return borrowedBookRepository.save(updateBorrowedBook);
                }).orElseThrow(() -> new RuntimeException("BorrowedBook was not found with the given ID"));
    }


    public String deleteBorrowedBook(String id) {
        borrowedBookRepository.deleteById(id);
        return "BorrowedBook was deleted successfully";
    }
}

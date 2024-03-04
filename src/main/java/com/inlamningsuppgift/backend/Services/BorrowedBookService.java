package com.inlamningsuppgift.backend.Services;

import com.inlamningsuppgift.backend.Repository.BookRepository;
import com.inlamningsuppgift.backend.Repository.BorrowedBookRepository;
import com.inlamningsuppgift.backend.Repository.UserRepository;
import com.inlamningsuppgift.backend.dto.BorrowedBook.BorrowedBookDTO;
import com.inlamningsuppgift.backend.dto.BorrowedBook.BorrowedBookDeleteDTO;
import com.inlamningsuppgift.backend.dto.BorrowedBook.BorrowedBookFoundByIdDTO;
import com.inlamningsuppgift.backend.dto.BorrowedBook.UpdateOneBorrowedBookDTO;
import com.inlamningsuppgift.backend.models.Book;
import com.inlamningsuppgift.backend.models.BorrowedBook;
import com.inlamningsuppgift.backend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
                    if (updateOneBorrowedBookDTO.getBorrowedBookId() != null) {
                        existingBorrowedBook.setId(updateOneBorrowedBookDTO.getBorrowedBookId());
                    }
                    if (updateOneBorrowedBookDTO.getBorrowedDate() != null) {
                        existingBorrowedBook.setBorrowedDate(updateOneBorrowedBookDTO.getBorrowedDate());
                    }
                    return borrowedBookRepository.save(existingBorrowedBook);
                }).orElseThrow(() -> new RuntimeException("BorrowedBook was not found with the given ID"));
    }

public ResponseEntity<?> deleteBorrowedBook(BorrowedBookDeleteDTO borrowedBookDeleteDTO) {
        borrowedBookRepository.findById(borrowedBookDeleteDTO.getBorrowedBookId())
                .orElseThrow(() -> new RuntimeException("BorrowedBook does not exist"));

        borrowedBookRepository.deleteById(borrowedBookDeleteDTO.getBorrowedBookId());
        return ResponseEntity.status(HttpStatus.OK).body("BorrowedBook was deleted successfully!");
        }


}

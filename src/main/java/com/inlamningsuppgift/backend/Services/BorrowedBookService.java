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


@Service
public class BorrowedBookService {

    @Autowired
    BorrowedBookRepository borrowedBookRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    UserRepository userRepository;


    public ResponseEntity<?> createBorrowedBook(BorrowedBookDTO borrowedBookDTO) {
        User findUser = userRepository.findById(borrowedBookDTO.getUserId()).orElseThrow(() -> new RuntimeException("User was not found"));
        Book findBook = bookRepository.findById(borrowedBookDTO.getBookId()).orElseThrow(() -> new RuntimeException("book was not found"));

        BorrowedBook newBorrowedBook = new BorrowedBook();
        newBorrowedBook.setUser(findUser);
        newBorrowedBook.setBook(findBook);
        return ResponseEntity.ok(borrowedBookRepository.save(newBorrowedBook));
    }

    public List<BorrowedBook> getAllBorrowedBook() {
        return borrowedBookRepository.findAll();
    }

    public BorrowedBook getOneBorrowedBook(BorrowedBookFoundByIdDTO borrowedBookFoundByIdDTO) {
        return borrowedBookRepository.findById(borrowedBookFoundByIdDTO.getBorrowedBookId()).orElseThrow(() -> new RuntimeException("No BorrowedBook matched the borrowedBookId provided"));
    }

    public BorrowedBook updateBorrowedBook(UpdateOneBorrowedBookDTO updateOneBorrowedBookDTO) {
        return borrowedBookRepository.findById(updateOneBorrowedBookDTO.getBorrowedBookId()).map(existingBorrowedBook -> {
            if (updateOneBorrowedBookDTO.getBorrowedBookId() != null) {
                existingBorrowedBook.setId(updateOneBorrowedBookDTO.getBorrowedBookId());
            }
            if (updateOneBorrowedBookDTO.getDueDate() != null) {
                existingBorrowedBook.setDueDate(updateOneBorrowedBookDTO.getDueDate());
            }
            return borrowedBookRepository.save(existingBorrowedBook);
        }).orElseThrow(() -> new RuntimeException("BorrowedBook was not found with the given ID"));
    }

    public ResponseEntity<?> deleteBorrowedBook(BorrowedBookDeleteDTO borrowedBookDeleteDTO) {
        borrowedBookRepository.findById(borrowedBookDeleteDTO.getBorrowedBookId()).orElseThrow(() -> new RuntimeException("BorrowedBook does not exist"));
        borrowedBookRepository.deleteById(borrowedBookDeleteDTO.getBorrowedBookId());
        return ResponseEntity.status(HttpStatus.OK).body("BorrowedBook was deleted successfully!" + borrowedBookDeleteDTO.getBorrowedBookDeletedAt());
    }
}

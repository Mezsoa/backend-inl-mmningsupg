package com.inlamningsuppgift.backend.Controllers;

import com.inlamningsuppgift.backend.Services.BorrowedBookService;
import com.inlamningsuppgift.backend.dto.BorrowedBook.BorrowedBookDTO;
import com.inlamningsuppgift.backend.dto.BorrowedBook.BorrowedBookDeleteDTO;
import com.inlamningsuppgift.backend.dto.BorrowedBook.BorrowedBookFoundByIdDTO;
import com.inlamningsuppgift.backend.dto.BorrowedBook.UpdateOneBorrowedBookDTO;
import com.inlamningsuppgift.backend.models.BorrowedBook;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class BorrowedBookController {

    @Autowired
    BorrowedBookService borrowedBookService;


    @PostMapping("/post")
    public ResponseEntity<?> createBorrowedBook(@Valid @RequestBody BorrowedBookDTO borrowedBookDTO) {
        return ResponseEntity.ok(borrowedBookService.createBorrowedBook(borrowedBookDTO));
    }

    // Get all Users
    @GetMapping("/find/all")
    public ResponseEntity<?> findAllBorrowedBooks() {
        return ResponseEntity.ok(borrowedBookService.getAllBorrowedBook());
    }

    //Find one specific User by id
    @GetMapping("/find")
    public Optional<BorrowedBook> findOneUser(@Valid @RequestBody BorrowedBookFoundByIdDTO borrowedBookFoundByIdDTO) {
        return borrowedBookService.getOneBorrowedBook(borrowedBookFoundByIdDTO);
    }

    //Update one User by id
    @PutMapping("/update")
    public BorrowedBook updateOneBorrowedBook(@Valid @RequestBody UpdateOneBorrowedBookDTO updateOneBorrowedBookDTO) {
        return borrowedBookService.updateBorrowedBook(updateOneBorrowedBookDTO);
    }

    //Delete one specific User by id
    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteBorrowedBook(@Valid @RequestBody BorrowedBookDeleteDTO borrowedBookDeleteDTO) {
        return borrowedBookService.deleteBorrowedBook(borrowedBookDeleteDTO);
    }
}

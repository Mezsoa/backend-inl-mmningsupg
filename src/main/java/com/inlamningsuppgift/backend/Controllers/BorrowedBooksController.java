package com.inlamningsuppgift.backend.Controllers;

import com.inlamningsuppgift.backend.Services.BorrowedBooksService;
import com.inlamningsuppgift.backend.models.BorrowedBooks;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/borrowedBooks")
public class BorrowedBooksController {

    @Autowired
    BorrowedBooksService borrowedBooksService;


    //POST-endpoint
    @PostMapping
    public ResponseEntity<BorrowedBooks> addBorrowedBooks(@Valid @RequestBody BorrowedBooks borrowedBooks) {

    }

    @PostMapping("/addBorrowedBook")
    public BorrowedBooks createBorrowedBooks(@RequestBody BorrowedBooks borrowedBooks) {
        return borrowedBooksService.createBorrowedBooks(borrowedBooks);
    }

    @GetMapping("/listBorrowedBook")
    public List<BorrowedBooks> getAllBorrowedBooks() {
        return borrowedBooksService.getAllBorrowedBooks();
    }

    @GetMapping("/getBorrowedBook/{id}")
    public BorrowedBooks getOneBorrowedBook(@PathVariable String id) {
        return borrowedBooksService.getOneBorrowedBook(id);
    }

    @PutMapping("/updateBorrowedBook/{id}")
    public BorrowedBooks updateBorrowedBooks(@RequestBody BorrowedBooks updateBorrowedBooks, @PathVariable("id") String _id) {
        return borrowedBooksService.updateBorrowedBooks(_id, updateBorrowedBooks);
    }

    @DeleteMapping("/deleteBorrowedBook/{id}")
    public String deleteBorrowedBook(@PathVariable String id) {
        return borrowedBooksService.deleteBorrowedBooks(id);
    }


}

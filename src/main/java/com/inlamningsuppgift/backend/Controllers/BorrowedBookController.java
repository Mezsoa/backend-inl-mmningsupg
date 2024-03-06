package com.inlamningsuppgift.backend.Controllers;
import com.inlamningsuppgift.backend.EntityNotFoundException.EntityNotFoundException;
import com.inlamningsuppgift.backend.Services.BorrowedBookService;
import com.inlamningsuppgift.backend.dto.BorrowedBook.BorrowedBookDTO;
import com.inlamningsuppgift.backend.dto.BorrowedBook.BorrowedBookDeleteDTO;
import com.inlamningsuppgift.backend.dto.BorrowedBook.BorrowedBookFoundByIdDTO;
import com.inlamningsuppgift.backend.dto.BorrowedBook.UpdateOneBorrowedBookDTO;
import com.inlamningsuppgift.backend.models.BorrowedBook;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/borrowedbook")
public class BorrowedBookController {

    @Autowired
    BorrowedBookService borrowedBookService;


    @PostMapping("/post")
    public ResponseEntity<?> createBorrowedBook(@Valid @RequestBody BorrowedBookDTO borrowedBookDTO) {
        return borrowedBookService.createBorrowedBook(borrowedBookDTO);
    }

    // Get all Users
    @GetMapping("/find/all")
    public ResponseEntity<?> findAllBorrowedBooks() {
        try {
            return ResponseEntity.ok(borrowedBookService.getAllBorrowedBook());
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    //Find one specific User by id
    @GetMapping("/find")
    public BorrowedBook findOneUser(@Valid @RequestBody BorrowedBookFoundByIdDTO borrowedBookFoundByIdDTO) {
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

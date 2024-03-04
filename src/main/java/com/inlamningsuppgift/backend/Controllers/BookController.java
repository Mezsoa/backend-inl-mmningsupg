package com.inlamningsuppgift.backend.Controllers;

import com.inlamningsuppgift.backend.Services.BookService;
import com.inlamningsuppgift.backend.dto.Book.BookCreationDTO;
import com.inlamningsuppgift.backend.dto.Book.BookDeleteDTO;
import com.inlamningsuppgift.backend.dto.Book.BookFoundByIdDTO;
import com.inlamningsuppgift.backend.dto.Book.UpdateOneBookDTO;
import com.inlamningsuppgift.backend.dto.User.UpdateOneUserDTO;
import com.inlamningsuppgift.backend.dto.User.UserCreationDTO;
import com.inlamningsuppgift.backend.dto.User.UserDeleteDTO;
import com.inlamningsuppgift.backend.dto.User.UserFoundByIdDTO;
import com.inlamningsuppgift.backend.models.Book;
import com.inlamningsuppgift.backend.models.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    BookService bookService;



    @PostMapping("/post")
    public ResponseEntity<?> createBook(@Valid @RequestBody BookCreationDTO bookCreationDTO) {
        return bookService.createBook(bookCreationDTO);
    }

    @GetMapping("/find/all")
    public ResponseEntity<?> findAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/find")
    public Optional<Book> findOneBook(@Valid @RequestBody BookFoundByIdDTO bookFoundByIdDTO) {
        return bookService.getOneBook(bookFoundByIdDTO);
    }

    @PutMapping("/update")
    public Book updateOneBook(@Valid @RequestBody UpdateOneBookDTO updateOneBookDTO) {
        return bookService.updateBook(updateOneBookDTO);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteBook(@Valid @RequestBody BookDeleteDTO bookDeleteDTO) {
        return bookService.deleteBook(bookDeleteDTO);
    }
}

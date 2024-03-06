package com.inlamningsuppgift.backend.Controllers;
import com.inlamningsuppgift.backend.EntityNotFoundException.EntityNotFoundException;
import com.inlamningsuppgift.backend.Services.BookService;
import com.inlamningsuppgift.backend.dto.Book.BookCreationDTO;
import com.inlamningsuppgift.backend.dto.Book.BookDeleteDTO;
import com.inlamningsuppgift.backend.dto.Book.BookFoundByIdDTO;
import com.inlamningsuppgift.backend.dto.Book.UpdateOneBookDTO;
import com.inlamningsuppgift.backend.models.Book;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
        try {
            return ResponseEntity.ok(bookService.getAllBooks());
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping("/find")
    public Book findOneBook(@Valid @RequestBody BookFoundByIdDTO bookFoundByIdDTO) {
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

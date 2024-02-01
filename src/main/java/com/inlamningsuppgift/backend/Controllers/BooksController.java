package com.inlamningsuppgift.backend.Controllers;

import com.inlamningsuppgift.backend.Services.BooksService;
import com.inlamningsuppgift.backend.models.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api") // Here we tell that all the controller methods(Endpoints) where we want to map them to.
public class BooksController {

    @Autowired
    BooksService booksService;



    //POST-endpoint to be able to add a new book
    // Here My method receives book details in the request body then it delegates to the BooksService to create and save the book.
    @PostMapping("/addBook")
    public Books createBooks(@RequestBody Books books) {
        return booksService.createBooks(books);
    }

    @GetMapping("/listBook")
    public List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    @GetMapping("/getBook/{id}")
    public Books getOneBook(@PathVariable String id) {
        return booksService.getOneBook(id);
    }

    @PutMapping("/updateBook/{id}")
    public Books updateBooks(@RequestBody Books updatedBook, @PathVariable("id") String _id) {
        return booksService.updateBooks(_id, updatedBook);
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable String id) {
        return booksService.deleteBook(id);
    }

    @DeleteMapping("/deletesBooks")
    public Books deleteBooks() {
        return booksService.deleteAll();

    }

}

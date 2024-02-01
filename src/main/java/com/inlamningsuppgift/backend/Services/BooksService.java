package com.inlamningsuppgift.backend.Services;

import com.inlamningsuppgift.backend.Repository.BooksRepository;
import com.inlamningsuppgift.backend.models.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;



    public Books createBooks(Books books) {
        return booksRepository.save(books);
    }

    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }

    public Books getOneBook(String id) {
        return booksRepository.findById(id).get();
    }

    public Books updateBooks(String _id, Books books) {
        return booksRepository.save(books);
    }

    public Books deleteAll() {
        booksRepository.deleteAll();
        return null;
    }

    public String deleteBook(String id) {
        booksRepository.deleteById(id);
        return "Deleted successfully!";
    }
}

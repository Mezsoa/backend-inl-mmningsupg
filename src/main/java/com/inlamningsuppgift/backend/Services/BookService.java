package com.inlamningsuppgift.backend.Services;

import com.inlamningsuppgift.backend.EntityNotFoundException.EntityNotFoundException;
import com.inlamningsuppgift.backend.Repository.BookRepository;
import com.inlamningsuppgift.backend.dto.Book.BookCreationDTO;
import com.inlamningsuppgift.backend.dto.Book.BookDeleteDTO;
import com.inlamningsuppgift.backend.dto.Book.BookFoundByIdDTO;
import com.inlamningsuppgift.backend.dto.Book.UpdateOneBookDTO;
import com.inlamningsuppgift.backend.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public ResponseEntity<?> createBook(BookCreationDTO bookCreationDTO) {
        Book newBook = new Book();
        newBook.setTitle(bookCreationDTO.getTitle());
        newBook.setGenres(bookCreationDTO.getGenres());
        newBook.setAuthor(bookCreationDTO.getAuthor());
        newBook.setBookDescription(bookCreationDTO.getBookDescription());
        newBook.setPublishedYear(bookCreationDTO.getPublishedYear());
        newBook.setCreatedAt(bookCreationDTO.getCreatedAt());

        return ResponseEntity.ok(bookRepository.save(newBook));
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getOneBook(BookFoundByIdDTO bookFoundByIdDTO) {
        return bookRepository.findById(bookFoundByIdDTO.getBookId()).orElseThrow(() -> new EntityNotFoundException("No Book matched the bookId provided"));
    }

    public Book updateBook(UpdateOneBookDTO updateOneBookDTO) {
        return bookRepository.findById(updateOneBookDTO.getBookId()).map(existingBook -> {
            if (updateOneBookDTO.getTitle() != null) {
                existingBook.setTitle(updateOneBookDTO.getTitle());
            }
            if (updateOneBookDTO.getGenres() != null) {
                existingBook.setGenres(updateOneBookDTO.getGenres());
            }
            if (updateOneBookDTO.getAuthor() != null) {
                existingBook.setAuthor(updateOneBookDTO.getAuthor());
            }
            if (updateOneBookDTO.getBookDescription() != null) {
                existingBook.setBookDescription(updateOneBookDTO.getBookDescription());
            }
            if (updateOneBookDTO.getPublishedYear() != null) {
                existingBook.setPublishedYear(updateOneBookDTO.getPublishedYear());
            }
            return bookRepository.save(existingBook);
        }).orElseThrow(() -> new RuntimeException("Book was not found"));
    }


    public ResponseEntity<?> deleteBook(BookDeleteDTO bookDeleteDTO) {
        bookRepository.findById(bookDeleteDTO.getBookId()).orElseThrow(() -> new RuntimeException("book was not found"));
        bookRepository.deleteById(bookDeleteDTO.getBookId());
        return ResponseEntity.status(HttpStatus.OK).body("Book was successfully deleted!" + "\n" + bookDeleteDTO.getBookDeletedAt());
    }

}

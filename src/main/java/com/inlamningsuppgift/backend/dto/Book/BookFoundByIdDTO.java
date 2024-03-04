package com.inlamningsuppgift.backend.dto.Book;

import jakarta.validation.constraints.NotBlank;

public class BookFoundByIdDTO {
    @NotBlank(message = "Book ID cannot be blank")
    private String bookId;


    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}

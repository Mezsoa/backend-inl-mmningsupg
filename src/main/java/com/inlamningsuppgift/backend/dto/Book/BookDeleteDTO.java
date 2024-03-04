package com.inlamningsuppgift.backend.dto.Book;

import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

public class BookDeleteDTO {

    private String bookId;
    @CreatedDate
    private Date bookDeletedAt = new Date();

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Date getBookDeletedAt() {
        return bookDeletedAt;
    }

    public void setBookDeletedAt(Date bookDeletedAt) {
        this.bookDeletedAt = bookDeletedAt;
    }
}

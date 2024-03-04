package com.inlamningsuppgift.backend.dto.BorrowedBook;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDate;

public class BorrowedBookDTO {
    @NotBlank(message = "User Id cannot be blank")
    private String userId;
    @NotBlank(message = "Book Id cannot be blank")
    private String bookId;
    @CreatedDate
    private LocalDate borrowedDate;
    @NotBlank(message = "DueDate cannot be blank")
    private String dueDate;






    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}

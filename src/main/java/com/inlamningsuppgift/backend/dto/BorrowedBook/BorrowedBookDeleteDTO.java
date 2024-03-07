package com.inlamningsuppgift.backend.dto.BorrowedBook;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

public class BorrowedBookDeleteDTO {

    @NotBlank(message = "BorrowedBook Id cannot be blank")
    private String borrowedBookId;

    @CreatedDate
    private Date borrowedBookDeletedAt = new Date();


    public String getBorrowedBookId() {
        return borrowedBookId;
    }

    public void setBorrowedBookId(String borrowedBookId) {
        this.borrowedBookId = borrowedBookId;
    }

    public Date getBorrowedBookDeletedAt() {
        return borrowedBookDeletedAt;
    }

    public void setBorrowedBookDeletedAt(Date borrowedBookDeletedAt) {
        this.borrowedBookDeletedAt = borrowedBookDeletedAt;
    }
}

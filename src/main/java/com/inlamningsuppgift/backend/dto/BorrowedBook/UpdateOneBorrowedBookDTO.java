package com.inlamningsuppgift.backend.dto.BorrowedBook;

import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

public class UpdateOneBorrowedBookDTO {
    private String borrowedBookId;
    @CreatedDate
    private LocalDate borrowedDate;
    private String dueDate;

    public String getBorrowedBookId() {
        return borrowedBookId;
    }
    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }
    public String getDueDate() {
        return dueDate;
    }

    public void setBorrowedBookId(String borrowedBookId) {
        this.borrowedBookId = borrowedBookId;
    }
    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}

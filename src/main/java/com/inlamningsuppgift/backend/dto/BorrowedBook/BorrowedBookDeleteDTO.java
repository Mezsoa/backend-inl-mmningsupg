package com.inlamningsuppgift.backend.dto.BorrowedBook;

import jakarta.validation.constraints.NotBlank;

public class BorrowedBookDeleteDTO {

    @NotBlank(message = "BorrowedBook Id cannot be blank")
    private String borrowedBookId;





    public String getBorrowedBookId() {
        return borrowedBookId;
    }

    public void setBorrowedBookId(String borrowedBookId) {
        this.borrowedBookId = borrowedBookId;
    }

}

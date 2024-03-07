package com.inlamningsuppgift.backend.dto.BorrowedBook;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;


public class UpdateOneBorrowedBookDTO {



    @NotBlank(message = "BorrowedBook Id cannot be blank")
    private String borrowedBookId;
    private LocalDate dueDate;








    public String getBorrowedBookId() {
        return borrowedBookId;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }




    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setBorrowedBookId(String borrowedBookId) {
        this.borrowedBookId = borrowedBookId;
    }
}

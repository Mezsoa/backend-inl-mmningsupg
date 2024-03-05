package com.inlamningsuppgift.backend.dto.BorrowedBook;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDate;
import java.util.Date;

public class BorrowedBookDTO {
    @NotBlank(message = "User Id cannot be blank")
    private String userId;
    @NotBlank(message = "Book Id cannot be blank")
    private String bookId;





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


}

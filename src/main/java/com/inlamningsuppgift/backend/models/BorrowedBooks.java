package com.inlamningsuppgift.backend.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "BorrowedBooks")
public class BorrowedBooks {

    @Id
    private String id;
    @DBRef
    private Users user;
    @DBRef
    private Books book;
    @CreatedDate
    private Date borrowedDate;
    private String dueDate;

    public String getId() {
        return id;
    }

    public Users getUser() {
        return user;
    }

    public Books getBook() {
        return book;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public String getDueDate() {
        return dueDate;
    }
}
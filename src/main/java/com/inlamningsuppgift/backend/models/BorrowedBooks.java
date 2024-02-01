package com.inlamningsuppgift.backend.models;

import org.apache.catalina.User;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document(collection = "BorrowedBooks")
public class BorrowedBooks {

    @Id
    private String id;

    private String user;

    private String book;
    @CreatedDate
    private Date borrowedDate;
    private String dueDate;

    public BorrowedBooks() {
    }

    public String getId() {
        return id;
    }

    public Date getborrowedDate() {
        return borrowedDate;
    }

    public String getDueDate() {
        return dueDate;
    }


    public String getUser() {
        return user;
    }

    public String getBook() {
        return book;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
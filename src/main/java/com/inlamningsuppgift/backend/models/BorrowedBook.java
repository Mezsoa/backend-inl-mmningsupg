package com.inlamningsuppgift.backend.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "BorrowedBook")
public class BorrowedBook {

    @Id
    private String id;
    @DBRef
    private User user;
    @DBRef
    private Book book;


    private LocalDate borrowedDate = LocalDate.now();
    // adds 30 days to whatever date it was when borrowedDate occurred
    private LocalDate dueDate = LocalDate.now().plusDays(30);







    public BorrowedBook() {
    }






    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
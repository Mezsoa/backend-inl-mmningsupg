package com.inlamningsuppgift.backend.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "books")
public class Books {
    @Id
    private String id;
    private String title;
    private String[] genres;
    private String[] author;
    private String bookDescription;
    private String publishedYear;
    @CreatedDate
    private Date created_at;


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String[] getGenres() {
        return genres;
    }

    public String[] getAuthor() {
        return author;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public Date getCreated_at() {
        return created_at;
    }
}

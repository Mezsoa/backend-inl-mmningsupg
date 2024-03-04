package com.inlamningsuppgift.backend.models;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Book")
public class Book {

    @Id
    private String id;
    @NotBlank(message = "Title cannot be blank")
    private String title;
    @NotBlank(message = "Genres cannot be blank")
    private String[] genres;
    @NotBlank(message = "Author cannot be blank")
    private String[] author;
    @NotBlank(message = "BookDescription cannot be blank")
    private String bookDescription;
    @NotBlank(message = "PublishedYear cannot be blank")
    private String publishedYear;
    @CreatedDate
    private Date created_at;

    public Book() {
    }


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

    public void setId(String id) {
        this.id = id;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }
}

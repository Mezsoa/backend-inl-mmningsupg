package com.inlamningsuppgift.backend.dto.Book;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

public class BookCreationDTO {

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


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}

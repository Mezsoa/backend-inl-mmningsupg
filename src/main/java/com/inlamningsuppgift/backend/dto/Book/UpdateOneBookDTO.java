package com.inlamningsuppgift.backend.dto.Book;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public class UpdateOneBookDTO {


    @NotBlank(message = "BookId cannot be blank")
    private String bookId;
    @NotBlank(message = "Title cannot be blank")
    private String title;
    @NotEmpty(message = "Genres cannot be null nor size zero")
    private String[] genres;
    @NotEmpty(message = "Author cannot be null nor size zero")
    private String[] author;
    @NotBlank(message = "BookDescription cannot be blank")
    private String bookDescription;
    @NotBlank(message = "PublishedYear cannot be blank")
    private String publishedYear;




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

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}

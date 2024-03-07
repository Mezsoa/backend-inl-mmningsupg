package com.inlamningsuppgift.backend.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Document(collection = "User")
public class User {

    @Id
    private String id;
    @NotBlank(message = "userName cannot be blank")
    private String userName;
    @NotBlank(message = "password cannot be blank")
    private String password;
    @NotBlank(message = "dateOfBirth cannot be blank")
    private String dateOfBirth;
    @NotBlank(message = "email cannot be blank")
    private String email;
    @NotEmpty(message = "address cannot be null nor size  zero")
    private String[] address;
    @CreatedDate
    private Date createdAt = new Date();

    public User() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }


    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}




//public Users() {
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String[] getAddress() {
//        return address;
//    }
//
//    public Date getCreated_at() {
//        return created_at;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setDateOfBirth(String dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setAddress(String[] address) {
//        this.address = address;
//    }
//
//    public void setCreated_at(Date created_at) {
//        this.created_at = created_at;
//    }
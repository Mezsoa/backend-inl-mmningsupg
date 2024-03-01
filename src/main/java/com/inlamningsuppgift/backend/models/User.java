package com.inlamningsuppgift.backend.models;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "User")
public class User {

    @Id
    private String id;
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
    @NotBlank
    private String dateOfBirth;
    @NotBlank
    private String email;
    private String[] address;
    @CreatedDate
    private Date created_at;

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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
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
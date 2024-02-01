package com.inlamningsuppgift.backend.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "Users")
public class Users {

    @Id
    private String id;
    private String userName;
    private String password;
    private String dateOfBirth;
    private String email;
    private String[] address;
    @CreatedDate
    private Date created_at;

    public Users() {
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String[] getAddress() {
        return address;
    }

    public Date getCreated_at() {
        return created_at;
    }
}
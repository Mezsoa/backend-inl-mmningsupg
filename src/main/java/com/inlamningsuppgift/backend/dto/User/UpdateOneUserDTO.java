package com.inlamningsuppgift.backend.dto.User;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.Date;

public class UpdateOneUserDTO {
    private String userId;
    @NotBlank(message = "userName cannot be blank")
    private String userName;
    @NotBlank(message = "password cannot be blank")
    private String password;
    @NotBlank(message = "dateOfBirth cannot be blank")
    private String dateOfBirth;
    @NotBlank(message = "email cannot be blank")
    private String email;
    @NotNull(message = "address cannot be null nor size zero")
    private String[] address;
    @CreatedDate
    private LocalDate updateAt;








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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }
}

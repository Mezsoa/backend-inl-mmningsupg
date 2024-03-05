package com.inlamningsuppgift.backend.dto.User;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.Date;

public class UserDeleteDTO {

    @NotBlank(message = "cannot be blank")
    private String userId;
    @CreatedDate
    private Date userDeletedAt = new Date();






    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getUserDeletedAt() {
        return userDeletedAt;
    }

    public void setUserDeletedAt(Date userDeletedAt) {
        this.userDeletedAt = userDeletedAt;
    }
}

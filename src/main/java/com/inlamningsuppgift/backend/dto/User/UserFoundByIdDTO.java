package com.inlamningsuppgift.backend.dto.User;
import jakarta.validation.constraints.NotBlank;

public class UserFoundByIdDTO {
    @NotBlank(message = "User ID cannot be blank")
    private String userId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

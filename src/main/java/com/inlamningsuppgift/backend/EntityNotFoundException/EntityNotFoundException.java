package com.inlamningsuppgift.backend.EntityNotFoundException;

public class EntityNotFoundException extends RuntimeException{

// This allows me to create a custom error message
    public EntityNotFoundException(String message){
        super(message);
    }
}

package com.inlamningsuppgift.backend.Controllers;

import com.inlamningsuppgift.backend.Services.UserService;
import com.inlamningsuppgift.backend.dto.User.UpdateOneUserDTO;
import com.inlamningsuppgift.backend.dto.User.UserCreationDTO;
import com.inlamningsuppgift.backend.dto.User.UserDeleteDTO;
import com.inlamningsuppgift.backend.dto.User.UserFoundByIdDTO;
import com.inlamningsuppgift.backend.models.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {


    @Autowired
    UserService userService;



// POST create a User
@PostMapping("/post")
public ResponseEntity<?> createUser(@Valid @RequestBody UserCreationDTO userCreationDTO) {
    return userService.createUser(userCreationDTO);
}

// Get all Users
@GetMapping("/find/all")
public ResponseEntity<?> findAllUsers() {
    return ResponseEntity.ok(userService.getAllUsers());
}

//Find one specific User by id
@GetMapping("/find")
public Optional<User> findOneUser(@Valid @RequestBody UserFoundByIdDTO userFoundByIdDTO) {
    return userService.getOneUser(userFoundByIdDTO);
}

//Update one User by id
@PutMapping("/update")
public User updateOneUser(@Valid @RequestBody UpdateOneUserDTO updateOneUserDTO) {
    return userService.updateUser(updateOneUserDTO);
}

//Delete one specific User by id
@DeleteMapping("/delete")
    public ResponseEntity<?> deleteUser(@Valid @RequestBody UserDeleteDTO userDeleteDTO) {
    return userService.deleteUser(userDeleteDTO);
}








}

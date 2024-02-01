package com.inlamningsuppgift.backend.Controllers;

import com.inlamningsuppgift.backend.Services.UsersService;
import com.inlamningsuppgift.backend.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UsersController {

    @Autowired
    UsersService usersService;



    //POST-endpoint to be able to add a new user
    @PostMapping("/addUser")
    public Users createUsers(@RequestBody Users users) {
        return usersService.createUsers(users);
    }

    @GetMapping("/listUser")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("/getUser/{id}")
    public Users getOneUser(@PathVariable String id) {
        return usersService.getOneUser(id);
    }

    @PutMapping("/updateUser/{id}")
    public Users updateUsers(@RequestBody Users updatedUser, @PathVariable("id") String _id) {
        return usersService.updateUsers(_id, updatedUser);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable String id) {
        return usersService.deleteUser(id);
    }

    @DeleteMapping("/deletesUsers")
    public Users deleteUsers() {
        return usersService.deleteAll();
    }



}
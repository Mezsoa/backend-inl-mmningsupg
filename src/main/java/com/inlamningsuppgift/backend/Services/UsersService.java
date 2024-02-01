package com.inlamningsuppgift.backend.Services;

import com.inlamningsuppgift.backend.Repository.UsersRepository;
import com.inlamningsuppgift.backend.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;


    public Users createUsers(Users users) {
        return usersRepository.save(users);
    }

    public List<Users> getAllUsers() {
        return  usersRepository.findAll();
    }

    public Users getOneUser(String id) {
        return usersRepository.findById(id).get();
    }

    public Users updateUsers(String _id, Users users) {
        return usersRepository.save(users);
    }

    public Users deleteAll() {
        usersRepository.deleteAll();
        return  null;
    }

    public String deleteUser(String id) {
        usersRepository.deleteById(id);
        return "Deleted successfully";
    }
}

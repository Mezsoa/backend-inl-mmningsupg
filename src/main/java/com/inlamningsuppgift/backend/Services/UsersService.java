package com.inlamningsuppgift.backend.Services;

import com.inlamningsuppgift.backend.Repository.UserRepository;
import com.inlamningsuppgift.backend.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UserRepository userRepository;










//    public Users createUsers(Users users) {
//        return usersRepository.save(users);
//    }
//
//    public List<Users> getAllUsers() {
//        return  usersRepository.findAll();
//    }
//
//    public Users getOneUser(String id) {
//        return usersRepository.findById(id).get();
//    }
//
//    public Users updateUsers(String _id, Users users) {
//        return usersRepository.save(users);
//    }
//
//    public Users deleteAll() {
//        usersRepository.deleteAll();
//        return  null;
//    }
//
//    public String deleteUser(String id) {
//        usersRepository.deleteById(id);
//        return "Deleted successfully";
//    }
}

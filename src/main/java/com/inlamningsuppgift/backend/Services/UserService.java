package com.inlamningsuppgift.backend.Services;

import com.inlamningsuppgift.backend.Repository.UserRepository;
import com.inlamningsuppgift.backend.dto.User.UpdateOneUserDTO;
import com.inlamningsuppgift.backend.dto.User.UserCreationDTO;
import com.inlamningsuppgift.backend.dto.User.UserDeleteDTO;
import com.inlamningsuppgift.backend.dto.User.UserFoundByIdDTO;
import com.inlamningsuppgift.backend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;




    public ResponseEntity<?> createUser(UserCreationDTO userCreationDTO) {
        User newUser = new User();
            newUser.setUserName(userCreationDTO.getUserName());
            newUser.setPassword(userCreationDTO.getPassword());
            newUser.setDateOfBirth(userCreationDTO.getDateOfBirth());
            newUser.setEmail(userCreationDTO.getEmail());
            newUser.setAddress(userCreationDTO.getAddress());
            newUser.setCreated_at(userCreationDTO.getCreated_at());

            return ResponseEntity.ok(userRepository.save(newUser));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getOneUser(UserFoundByIdDTO userFoundByIdDTO) {
        return userRepository.findById(userFoundByIdDTO.getUserId());
    }

    public User updateUser(UpdateOneUserDTO updateOneUserDTO) {
        return userRepository.findById(updateOneUserDTO.getUserId())
                .map(existingUser -> {
                    if (updateOneUserDTO.getUserName() != null) {
                        existingUser.setUserName(updateOneUserDTO.getUserName());
                    }
                    if (updateOneUserDTO.getPassword() != null) {
                        existingUser.setPassword(updateOneUserDTO.getPassword());
                    }
                    if (updateOneUserDTO.getDateOfBirth() != null) {
                        existingUser.setDateOfBirth(updateOneUserDTO.getDateOfBirth());
                    }
                    if (updateOneUserDTO.getEmail() != null) {
                        existingUser.setEmail(updateOneUserDTO.getEmail());
                    }
                    if (updateOneUserDTO.getAddress() != null) {
                        existingUser.setAddress(updateOneUserDTO.getAddress());
                    }
                    return userRepository.save(existingUser);
                }).orElseThrow(() -> new RuntimeException("User was not found"));
    }

    public ResponseEntity<?> deleteUser(UserDeleteDTO userDeleteDTO) {
        userRepository.findById(userDeleteDTO.getUserId())
                .orElseThrow(() -> new RuntimeException("User was not found"));
        userRepository.deleteById(userDeleteDTO.getUserId());
        return ResponseEntity.status(HttpStatus.OK).body("User was deleted successfully!");
    }









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

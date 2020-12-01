package com.example.myMoneyApp.service.interfaces;

import com.example.myMoneyApp.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> getUserById(Integer id);
    List<User> getAllUser();
    void deleteAllUsers();
    void deleteUserById(Integer id);
    void updateUserById(Integer id, User user);
    void updateUser(User user);
    void insertUser(User user);


}


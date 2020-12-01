package com.example.myMoneyApp.service.implementations;

import com.example.myMoneyApp.model.User;
import com.example.myMoneyApp.repository.UserRepository;
import com.example.myMoneyApp.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUserById(Integer id, User user) {
        Optional<User> getUser = getUserById(id);
        getUser.get().setAddress(user.getAddress());
        getUser.get().setEmail(user.getEmail());
        getUser.get().setIdentifier(user.getIdentifier());
        getUser.get().setMobile_phone(user.getMobile_phone());
        getUser.get().setName(user.getName());
        getUser.get().setPassword(user.getPassword());

        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void insertUser(User user) {
        userRepository.save(user);
    }
}

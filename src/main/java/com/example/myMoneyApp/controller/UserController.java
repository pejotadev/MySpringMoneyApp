package com.example.myMoneyApp.controller;

import com.example.myMoneyApp.model.User;
import com.example.myMoneyApp.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/getAll", method = RequestMethod.GET)
    public List<User> getUser() {
        return userService.getAllUser();
    }

    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    public Optional<User> getUser(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/user/deleteAll", method = RequestMethod.DELETE)
    public void deleteUsers() {
        userService.deleteAllUsers();
    }

    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
    }

    @RequestMapping(value = "/user/update/{id}", method = RequestMethod.POST)
    public void updateUser(@RequestBody User user, @PathVariable("id") Integer id) {
        userService.updateUserById(id, user);
    }

    @RequestMapping(value = "/user/insert", method = RequestMethod.POST)
    public void updateUser(@RequestBody User user) {
        userService.insertUser(user);
    }
}

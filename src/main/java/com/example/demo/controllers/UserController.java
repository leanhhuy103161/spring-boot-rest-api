package com.example.demo.controllers;

import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

public class UserController {
    @Autowired
    private UserService userService;

    

//    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @GetMapping("/users")
    public RequestEntity<?> getListUser() {
        return null;
    }

    @PostMapping ("/users")
    public RequestEntity<?> createUser() {
        return null;
    }

    @GetMapping("/users/{id}")
    public RequestEntity<?> getUser() {
        return null;
    }

    @PutMapping("/users/{id}")
    public RequestEntity<?> putUser() {
        return null;
    }

    @PatchMapping("/users/{id}")
    public RequestEntity<?> updateUser() {
        return null;
    }

    @DeleteMapping("/users")
    public RequestEntity<?> deleteUser() {
        return null;
    }
}

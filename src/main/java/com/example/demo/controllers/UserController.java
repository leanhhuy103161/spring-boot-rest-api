package com.example.demo.controllers;

import com.example.demo.entity.User;
import com.example.demo.model.dto.UserDto;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/search")
    public ResponseEntity<?> searchUser(@RequestParam(value = "keyword", required = false, defaultValue = "") String name) {
        List<UserDto> users = userService.searchUser(name);

        return ResponseEntity.ok(users);
    }

    @GetMapping("/users")
    public ResponseEntity<?> getListUser() {
        List<UserDto> users = userService.getListUser();
        System.out.println(users);
        return ResponseEntity.ok(users);
    }

    @PostMapping ("/users")
    public RequestEntity<?> createUser() {
        return null;
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        System.out.println(id);
        UserDto result = userService.getUserById(id);
        return ResponseEntity.ok(result);
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

package com.dilson.bricktask.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dilson.bricktask.models.User;
import com.dilson.bricktask.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        User newUser = this.userService.create(user);

        return ResponseEntity.ok().body(newUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody User user, UUID id) {
        user.setId(id);
        this.userService.update(user);
        return ResponseEntity.noContent().build();
    }

}

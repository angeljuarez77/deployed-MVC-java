package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.exception.ResourceNotFoundException;
import com.example.test.model.User;
import com.example.test.repository.UserRepository;

@RestController
@RequestMapping("/tae_api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getAllCustomers(Model model) {

        return this.userRepository.findAll();

    }

//get a user by email

    @GetMapping("/user/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable(value = "email") String email)
            throws ResourceNotFoundException {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("User not found. Email :: " + email));
        return ResponseEntity.ok().body(user);
    }

}
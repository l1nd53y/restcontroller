package com.example.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {
    User user = new User("Lindsey");

    @GetMapping
    public User findName() {
        return this.user;
    }
}
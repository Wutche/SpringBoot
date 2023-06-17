package com.stringcode.restapiintroduction.controller;

import Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping("/user")
    public User user() {
        User user = new User(001, "Wutche", "Chikaome");
        return user;
    }

    @GetMapping("/students")
    public List<User> userList() {
        List<User> user = new ArrayList<>();

        user.add(new User(2, "Sophia", "Okosodo"));
        user.add(new User(3, "Jane", "Brons"));
        user.add(new User(4, "Ushie", "Anthony"));
        user.add(new User(5, "James", "Smith"));
        user.add(new User(6, "John", "LOui"));

        return user;
    }

    @GetMapping("/user/{id}")
    public User userPathVariable(@PathVariable("id") int userid) {
        return new User(userid, user().getFirstName(), user().getFirstName());
    }
}

package com.bank.api.controller;
import com.bank.api.repository.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Sosat";
    }

    @GetMapping("/user")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.Id = 1;
        user.Name = "Alex";
        user.Surname = "Tetster";

        return user;
    }
}

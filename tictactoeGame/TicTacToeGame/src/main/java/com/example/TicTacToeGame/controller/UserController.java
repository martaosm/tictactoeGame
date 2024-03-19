package com.example.TicTacToeGame.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    @PostMapping("/login")
    public boolean login(@RequestParam("username") String username, @RequestParam("password") String password) {
        return username.equals("user") && password.equals("user");
    }
}

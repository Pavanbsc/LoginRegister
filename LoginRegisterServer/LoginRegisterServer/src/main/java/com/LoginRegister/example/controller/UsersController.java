package com.LoginRegister.example.controller;

import com.LoginRegister.example.entity.Users;
import com.LoginRegister.example.requests.LoginRequest;
import com.LoginRegister.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public Users addUser(@RequestBody Users user){
  return userService.addUser(user);
    }

    @PostMapping("/loginUser")
    public Boolean loginUser(@RequestBody LoginRequest loginRequest){
        return userService.loginUser(loginRequest);
    }
}

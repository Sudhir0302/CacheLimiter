package com.sudhir03.redisproxy.controller;

import com.sudhir03.redisproxy.model.User;
import com.sudhir03.redisproxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public void getUser(@RequestParam String id)
    {
        User user= userService.getUser(id);
        System.out.println(user);
    }

    @PostMapping("/adduser")
    public void addUser(@RequestBody User user)
    {
        userService.saveUser(user);
        System.out.println("addeddd");
    }
}

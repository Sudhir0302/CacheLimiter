package com.sudhir03.redisproxy.controller;

import com.sudhir03.redisproxy.model.User;
import com.sudhir03.redisproxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping("/getuser")
    public User getUser(@RequestParam int id)
    {
        User user= userService.getUser(id);
        System.out.println(user);
        return user;
    }

    @PostMapping("/adduser")
    public ResponseEntity<?> addUser(@RequestBody User user)
    {
        userService.saveUser(user);
//        System.out.println("addeddd");
//        return new ResponseEntity<>("success", HttpStatusCode.valueOf(200));
        return ResponseEntity.ok("user data saved");
    }
}

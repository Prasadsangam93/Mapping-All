package com.springboot.oneToOneMappingDemo1.controller;

import com.springboot.oneToOneMappingDemo1.entity.User;
import com.springboot.oneToOneMappingDemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){

        return userService.saveUser(user);
    }
    @GetMapping("/fetch")
    public List<User> fetchAllUser(){
      return userService.fetchAll();
    }

    @GetMapping("findById/{userId}")

    public User findBuUserId(@PathVariable Long userId){
        return userService.findById(userId);
    }

}

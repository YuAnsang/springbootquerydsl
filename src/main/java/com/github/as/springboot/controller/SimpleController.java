package com.github.as.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.as.springboot.dto.user.UserDTO;
import com.github.as.springboot.service.user.UserService;

@RestController
public class SimpleController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    
    @GetMapping("/users")
    public List<UserDTO> getUsers() {
        return userService.findByname("test");
    }
}

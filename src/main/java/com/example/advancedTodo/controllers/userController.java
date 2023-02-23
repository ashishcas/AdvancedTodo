package com.example.advancedTodo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class userController {
    

    @GetMapping("/")
    public String handler(){
        return "Hello World";
    }
}

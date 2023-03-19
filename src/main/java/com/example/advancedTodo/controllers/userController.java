package com.example.advancedTodo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.advancedTodo.models.User;
import com.example.advancedTodo.services.UserServiceImpl;

import reactor.core.publisher.Mono;


@RestController
public class userController {
    
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public String handler(){
        return "Hello World";
    }

    @PostMapping("/create")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Mono<ResponseEntity<User>> createUser(@RequestBody User user){
        System.out.println("will insert the student's record :: "+ user.getId() + " :: " + user.getFirstName());
            // Mono<User>  userResponse = userService.saveUser(user);
            // HttpHeaders returnHeaders = new HttpHeaders();
            // return new ResponseEntity(userResponse,returnHeaders, HttpStatus.CREATED);
            return  userService.saveUser(user)
                    .map(ResponseEntity::ok)
                    .defaultIfEmpty(ResponseEntity.notFound().build());


    }
}

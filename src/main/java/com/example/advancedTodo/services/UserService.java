package com.example.advancedTodo.services;
import com.example.advancedTodo.models.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface UserService {
    
    Mono<User>  saveUser(User user);

    Flux<User> getAllUsers();
    
    Mono<User> updateUser(String userId);

    Mono<Void> deletUser(String userId);
    
}

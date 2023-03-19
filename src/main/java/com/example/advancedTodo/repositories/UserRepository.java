package com.example.advancedTodo.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.advancedTodo.models.User;

public interface UserRepository extends ReactiveCrudRepository<User,String> {
    
}

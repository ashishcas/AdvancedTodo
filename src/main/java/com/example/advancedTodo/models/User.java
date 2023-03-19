package com.example.advancedTodo.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(value = "user")
public class User {

    @Id
    @Generated
    private String id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NotNull
    @Pattern(regexp = "([a-z])+@([a-z])+\\.com", message = "Email should match the pattern a-z @ a-z .com")
    private String email;
    
}

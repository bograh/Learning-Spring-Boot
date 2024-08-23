package com.example.project1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String name;
    private String username;
    private String email;
    private String password;

    public User() {
    }

    public User(long userId, String name, String username, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

}

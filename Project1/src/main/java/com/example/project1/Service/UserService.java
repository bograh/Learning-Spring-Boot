package com.example.project1.Service;

import com.example.project1.Entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public User getUserById(long id);

    public User addUser(User user);

    public User updateUser(long userId, User user);

    public void deleteUser(long userId);
}

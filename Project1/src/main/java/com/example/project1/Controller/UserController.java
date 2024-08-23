package com.example.project1.Controller;

import com.example.project1.Entity.User;
import com.example.project1.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") long userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable("userId") long userId, @RequestBody User user) {
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") long userId) {
        userService.deleteUser(userId);
        return "User Deleted Successfully";
    }

}

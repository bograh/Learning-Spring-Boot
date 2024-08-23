package com.example.project1.Service;

import com.example.project1.Entity.User;
import com.example.project1.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(long userId, User user) {
        User userDB = userRepository.findById(userId).orElse(null);
        if (userDB != null) {
            userDB.setName(user.getName());
            userDB.setEmail(user.getEmail());
            return userRepository.save(userDB);
        }

        return null;
    }

    @Override
    public void deleteUser(long userId) {
        userRepository.deleteById(userId);
    }
}

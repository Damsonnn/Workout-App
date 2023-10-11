package com.damcio.workoutapp.service;

import com.damcio.workoutapp.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Integer id);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Integer id);
}

package com.damcio.workoutapp.repository;

import com.damcio.workoutapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

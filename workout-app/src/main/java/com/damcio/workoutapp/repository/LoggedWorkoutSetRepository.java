package com.damcio.workoutapp.repository;

import com.damcio.workoutapp.model.LoggedWorkoutSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggedWorkoutSetRepository extends JpaRepository<LoggedWorkoutSet, Integer> {
}

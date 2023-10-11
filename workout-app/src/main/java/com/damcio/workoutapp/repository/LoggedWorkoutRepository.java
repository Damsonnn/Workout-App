package com.damcio.workoutapp.repository;

import com.damcio.workoutapp.model.LoggedWorkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggedWorkoutRepository extends JpaRepository<LoggedWorkout, Integer> {
}

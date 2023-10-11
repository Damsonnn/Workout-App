package com.damcio.workoutapp.repository;

import com.damcio.workoutapp.model.WorkoutTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutTemplateRepository extends JpaRepository<WorkoutTemplate, Integer> {
}

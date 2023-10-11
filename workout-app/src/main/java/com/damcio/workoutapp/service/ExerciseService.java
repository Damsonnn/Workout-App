package com.damcio.workoutapp.service;

import com.damcio.workoutapp.model.Exercise;

import java.util.List;

public interface ExerciseService {
    Exercise createExercise(Exercise exercise);

    Exercise getExerciseById(Integer id);

    List<Exercise> getAllExercises();

    Exercise updateExercise(Exercise exercise);

    void deleteExercise(Integer id);
}

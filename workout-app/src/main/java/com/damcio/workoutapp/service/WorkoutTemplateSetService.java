package com.damcio.workoutapp.service;

import com.damcio.workoutapp.model.WorkoutTemplateSet;

public interface WorkoutTemplateSetService {
    WorkoutTemplateSet createWorkoutTemplateSet(WorkoutTemplateSet workoutTemplateSet);

    WorkoutTemplateSet getWorkoutTemplateSetById(Integer id);

    void deleteWorkoutTemplateSet(Integer id);
}


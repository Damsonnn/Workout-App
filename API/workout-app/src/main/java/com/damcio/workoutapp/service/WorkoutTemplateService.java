package com.damcio.workoutapp.service;

import com.damcio.workoutapp.model.WorkoutTemplate;

import java.util.List;

public interface WorkoutTemplateService {
    WorkoutTemplate createWorkoutTemplate(WorkoutTemplate workoutTemplate);

    WorkoutTemplate getWorkoutTemplateById(Integer id);

    List<WorkoutTemplate> getAllWorkoutTemplates();

    WorkoutTemplate updateWorkoutTemplate(WorkoutTemplate workoutTemplate);

    void deleteWorkoutTemplate(Integer id);
}

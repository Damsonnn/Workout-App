package com.damcio.workoutapp.service.impl;

import com.damcio.workoutapp.model.WorkoutTemplateSet;
import com.damcio.workoutapp.repository.WorkoutTemplateSetRepository;
import com.damcio.workoutapp.service.WorkoutTemplateSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkoutTemplateSetServiceImpl implements WorkoutTemplateSetService {

    @Autowired
    private WorkoutTemplateSetRepository workoutTemplateSetRepository;

    @Override
    public WorkoutTemplateSet createWorkoutTemplateSet(WorkoutTemplateSet workoutTemplateSet) {
        return workoutTemplateSetRepository.save(workoutTemplateSet);
    }

    @Override
    public WorkoutTemplateSet getWorkoutTemplateSetById(Integer id) {
        Optional<WorkoutTemplateSet> optionalWorkoutTemplateSet = workoutTemplateSetRepository.findById(id);
        return optionalWorkoutTemplateSet.get();
    }

    @Override
    public void deleteWorkoutTemplateSet(Integer id) {
        workoutTemplateSetRepository.deleteById(id);
    }
}

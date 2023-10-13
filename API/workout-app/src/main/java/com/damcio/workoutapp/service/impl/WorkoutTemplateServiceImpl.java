package com.damcio.workoutapp.service.impl;

import com.damcio.workoutapp.model.WorkoutTemplate;
import com.damcio.workoutapp.repository.WorkoutTemplateRepository;
import com.damcio.workoutapp.service.WorkoutTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutTemplateServiceImpl implements WorkoutTemplateService {

    @Autowired
    private WorkoutTemplateRepository workoutTemplateRepository;

    @Override
    public WorkoutTemplate createWorkoutTemplate(WorkoutTemplate workoutTemplate) {
        return workoutTemplateRepository.save(workoutTemplate);
    }

    @Override
    public WorkoutTemplate getWorkoutTemplateById(Integer id) {
        Optional<WorkoutTemplate> optionalWorkoutTemplate = workoutTemplateRepository.findById(id);
        return optionalWorkoutTemplate.get();
    }

    @Override
    public List<WorkoutTemplate> getAllWorkoutTemplates() {
        return workoutTemplateRepository.findAll();
    }

    @Override
    public WorkoutTemplate updateWorkoutTemplate(WorkoutTemplate workoutTemplate) {
        WorkoutTemplate existingWorkoutTemplate = workoutTemplateRepository.findById(workoutTemplate.getId()).get();
        existingWorkoutTemplate.setName(workoutTemplate.getName());
        return workoutTemplateRepository.save(existingWorkoutTemplate);
    }

    @Override
    public void deleteWorkoutTemplate(Integer id) {
        workoutTemplateRepository.deleteById(id);
    }
}

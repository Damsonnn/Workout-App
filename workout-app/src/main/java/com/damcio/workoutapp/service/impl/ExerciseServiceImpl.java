package com.damcio.workoutapp.service.impl;

import com.damcio.workoutapp.model.Exercise;
import com.damcio.workoutapp.repository.ExerciseRepository;
import com.damcio.workoutapp.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Override
    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @Override
    public Exercise getExerciseById(Integer id) {
        Optional<Exercise> optionalExercise = exerciseRepository.findById(id);
        return optionalExercise.get();
    }

    @Override
    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }

    @Override
    public Exercise updateExercise(Exercise exercise) {
        Exercise existingExercise = exerciseRepository.findById(exercise.getId()).get();
        existingExercise.setName(exercise.getName());
        existingExercise.setBodyPart(exercise.getBodyPart());
        return exerciseRepository.save(existingExercise);
    }

    @Override
    public void deleteExercise(Integer id) {
        exerciseRepository.deleteById(id);
    }
}

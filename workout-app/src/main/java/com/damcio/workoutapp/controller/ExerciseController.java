package com.damcio.workoutapp.controller;

import com.damcio.workoutapp.model.Exercise;
import com.damcio.workoutapp.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @PostMapping
    public ResponseEntity<Exercise> createExercise(@RequestBody Exercise exercise){
        Exercise savedExercise = exerciseService.createExercise(exercise);
        return new ResponseEntity<>(savedExercise, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Exercise> getExerciseById(@PathVariable("id") Integer id){
        Exercise exercise = exerciseService.getExerciseById(id);
        return new ResponseEntity<>(exercise, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Exercise>> getAllExercises(){
        List<Exercise> exercises = exerciseService.getAllExercises();
        return new ResponseEntity<>(exercises, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Exercise> updateExercise(@PathVariable("id") Integer id, @RequestBody Exercise exercise){
        exercise.setId(id);
        Exercise updatedExercise = exerciseService.updateExercise(exercise);
        return new ResponseEntity<>(updatedExercise, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteExercise(@PathVariable("id") Integer id){
        exerciseService.deleteExercise(id);
        return new ResponseEntity<>("Exercise deleted", HttpStatus.OK);
    }
}

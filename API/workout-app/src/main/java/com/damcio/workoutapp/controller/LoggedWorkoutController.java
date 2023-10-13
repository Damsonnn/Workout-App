package com.damcio.workoutapp.controller;

import com.damcio.workoutapp.model.LoggedWorkout;
import com.damcio.workoutapp.service.LoggedWorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loggedWorkouts")
public class LoggedWorkoutController {

    @Autowired
    private LoggedWorkoutService loggedWorkoutService;

    @PostMapping
    public ResponseEntity<LoggedWorkout> createLoggedWorkout(@RequestBody LoggedWorkout loggedWorkout){
        LoggedWorkout savedLoggedWorkout = loggedWorkoutService.createLoggedWorkout(loggedWorkout);
        return new ResponseEntity<>(savedLoggedWorkout, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<LoggedWorkout> getLoggedWorkoutById(@PathVariable("id") Integer id){
        LoggedWorkout loggedWorkout = loggedWorkoutService.getLoggedWorkoutById(id);
        return new ResponseEntity<>(loggedWorkout, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<LoggedWorkout>> getAllLoggedWorkouts(){
        List<LoggedWorkout> loggedWorkouts = loggedWorkoutService.getAllLoggedWorkouts();
        return new ResponseEntity<>(loggedWorkouts, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteLoggedWorkout(@PathVariable("id") Integer id){
        loggedWorkoutService.deleteLoggedWorkout(id);
        return new ResponseEntity<>("LoggedWorkout deleted", HttpStatus.OK);
    }
}

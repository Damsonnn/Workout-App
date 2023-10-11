package com.damcio.workoutapp.controller;

import com.damcio.workoutapp.model.LoggedWorkoutSet;
import com.damcio.workoutapp.service.LoggedWorkoutSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loggedWorkoutsets")
public class LoggedWorkoutSetController {

    @Autowired
    private LoggedWorkoutSetService loggedWorkoutSetService;

    @PostMapping
    public ResponseEntity<LoggedWorkoutSet> createLoggedWorkoutSet(@RequestBody LoggedWorkoutSet loggedWorkoutSet){
        LoggedWorkoutSet savedLoggedWorkoutSet = loggedWorkoutSetService.createLoggedWorkoutSet(loggedWorkoutSet);
        return new ResponseEntity<>(savedLoggedWorkoutSet, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<LoggedWorkoutSet> getLoggedWorkoutSetById(@PathVariable("id") Integer id){
        LoggedWorkoutSet loggedWorkoutSet = loggedWorkoutSetService.getLoggedWorkoutSetById(id);
        return new ResponseEntity<>(loggedWorkoutSet, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteLoggedWorkoutSet(@PathVariable("id") Integer id){
        loggedWorkoutSetService.deleteLoggedWorkoutSet(id);
        return new ResponseEntity<>("LoggedWorkoutSet deleted", HttpStatus.OK);
    }
}

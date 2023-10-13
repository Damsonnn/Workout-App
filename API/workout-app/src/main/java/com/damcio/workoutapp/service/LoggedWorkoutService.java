package com.damcio.workoutapp.service;

import com.damcio.workoutapp.model.LoggedWorkout;

import java.util.List;

public interface LoggedWorkoutService {
    LoggedWorkout createLoggedWorkout(LoggedWorkout loggedWorkout);

    LoggedWorkout getLoggedWorkoutById(Integer id);

    List<LoggedWorkout> getAllLoggedWorkouts();

    void deleteLoggedWorkout(Integer id);
}

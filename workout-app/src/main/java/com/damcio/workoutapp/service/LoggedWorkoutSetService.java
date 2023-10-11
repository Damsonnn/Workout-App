package com.damcio.workoutapp.service;

import com.damcio.workoutapp.model.LoggedWorkoutSet;

public interface LoggedWorkoutSetService {
    LoggedWorkoutSet createLoggedWorkoutSet(LoggedWorkoutSet loggedWorkoutSet);

    LoggedWorkoutSet getLoggedWorkoutSetById(Integer id);

    void deleteLoggedWorkoutSet(Integer id);
}


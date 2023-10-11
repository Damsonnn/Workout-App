package com.damcio.workoutapp.service.impl;

import com.damcio.workoutapp.model.LoggedWorkoutSet;
import com.damcio.workoutapp.repository.LoggedWorkoutSetRepository;
import com.damcio.workoutapp.service.LoggedWorkoutSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoggedWorkoutSetServiceImpl implements LoggedWorkoutSetService {

    @Autowired
    private LoggedWorkoutSetRepository loggedWorkoutSetRepository;

    @Override
    public LoggedWorkoutSet createLoggedWorkoutSet(LoggedWorkoutSet loggedWorkoutSet) {
        return loggedWorkoutSetRepository.save(loggedWorkoutSet);
    }

    @Override
    public LoggedWorkoutSet getLoggedWorkoutSetById(Integer id) {
        Optional<LoggedWorkoutSet> optionalLoggedWorkoutSet = loggedWorkoutSetRepository.findById(id);
        return optionalLoggedWorkoutSet.get();
    }

    @Override
    public void deleteLoggedWorkoutSet(Integer id) {
        loggedWorkoutSetRepository.deleteById(id);
    }
}

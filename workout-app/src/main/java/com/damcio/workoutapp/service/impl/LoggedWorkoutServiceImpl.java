package com.damcio.workoutapp.service.impl;

import com.damcio.workoutapp.model.LoggedWorkout;
import com.damcio.workoutapp.repository.LoggedWorkoutRepository;
import com.damcio.workoutapp.service.LoggedWorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

        import java.util.List;
        import java.util.Optional;

@Service
public class LoggedWorkoutServiceImpl implements LoggedWorkoutService {

    @Autowired
    private LoggedWorkoutRepository loggedWorkoutRepository;

    @Override
    public LoggedWorkout createLoggedWorkout(LoggedWorkout loggedWorkout) {
        return loggedWorkoutRepository.save(loggedWorkout);
    }

    @Override
    public LoggedWorkout getLoggedWorkoutById(Integer id) {
        Optional<LoggedWorkout> optionalLoggedWorkout = loggedWorkoutRepository.findById(id);
        return optionalLoggedWorkout.get();
    }

    @Override
    public List<LoggedWorkout> getAllLoggedWorkouts() {
        return loggedWorkoutRepository.findAll();
    }

    @Override
    public void deleteLoggedWorkout(Integer id) {
        loggedWorkoutRepository.deleteById(id);
    }
}

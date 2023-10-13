package com.damcio.workoutapp.service.impl;

import com.damcio.workoutapp.model.BodyPart;
import com.damcio.workoutapp.repository.BodyPartRepository;
import com.damcio.workoutapp.service.BodyPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BodyPartServiceImpl implements BodyPartService {

    @Autowired
    private BodyPartRepository bodyPartRepository;

    @Override
    public BodyPart createBodyPart(BodyPart bodyPart) {
        return bodyPartRepository.save(bodyPart);
    }

    @Override
    public BodyPart getBodyPartById(Integer id) {
        Optional<BodyPart> optionalBodyPart = bodyPartRepository.findById(id);
        return optionalBodyPart.get();
    }

    @Override
    public List<BodyPart> getAllBodyParts() {
        return bodyPartRepository.findAll();
    }

    @Override
    public BodyPart updateBodyPart(BodyPart bodyPart) {
        BodyPart existingBodyPart = bodyPartRepository.findById(bodyPart.getId()).get();
        existingBodyPart.setName(bodyPart.getName());
        return bodyPartRepository.save(existingBodyPart);
    }

    @Override
    public void deleteBodyPart(Integer id) {
        bodyPartRepository.deleteById(id);
    }
}


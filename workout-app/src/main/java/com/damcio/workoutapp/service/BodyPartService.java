package com.damcio.workoutapp.service;

import com.damcio.workoutapp.model.BodyPart;

import java.util.List;

public interface BodyPartService {
    BodyPart createBodyPart(BodyPart bodyPart);

    BodyPart getBodyPartById(Integer id);

    List<BodyPart> getAllBodyParts();

    BodyPart updateBodyPart(BodyPart bodyPart);

    void deleteBodyPart(Integer id);
}

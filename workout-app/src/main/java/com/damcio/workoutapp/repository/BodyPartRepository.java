package com.damcio.workoutapp.repository;

import com.damcio.workoutapp.model.BodyPart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodyPartRepository extends JpaRepository<BodyPart, Integer> {
}

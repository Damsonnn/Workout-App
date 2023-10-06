package com.damcio.workoutapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class LoggedWorkoutSet {
    @Id
    @SequenceGenerator(
            name = "logged_workout_set_id_sequence",
            sequenceName = "logged_workout_set_id_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "logged_workout_set_id_sequence"
    )
    private Integer id;

    @Column(nullable = false)
    private Integer setNumber;

    private Integer repetitions;

    private Double weight;

    @ManyToOne
    @JoinColumn(name = "logged_workout_id", nullable = false)
    private LoggedWorkout loggedWorkout;

    @ManyToOne
    @JoinColumn(name = "logged_workout_id", nullable = false)
    private Exercise exercise;
}

package com.damcio.workoutapp.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class WorkoutTemplateSet {
    @Id
    @SequenceGenerator(
            name = "workout_template_set_id_sequence",
            sequenceName = "workout_template_set_id_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "workout_template_set_id_sequence"
    )
    private Integer id;

    @Column(nullable = false)
    private Integer setNumber;

    @ManyToOne
    @JoinColumn(name="workout_template_id", nullable = false)
    private WorkoutTemplate workoutTemplate;

    @ManyToOne
    @JoinColumn(name = "exercise_id", nullable = false)
    private Exercise exercise;
}

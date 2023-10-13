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
public class Exercise {
    @Id
    @SequenceGenerator(
            name = "exercise_id_sequence",
            sequenceName = "exercise_id_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "exercise_id_sequence"
    )
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "exercise", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LoggedWorkoutSet> loggedWorkoutSets;

    @OneToMany(mappedBy = "exercise", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<WorkoutTemplateSet> workoutTemplateSets;

    @ManyToOne
    @JoinColumn(name = "body_part_id", nullable = false)
    private BodyPart bodyPart;
}

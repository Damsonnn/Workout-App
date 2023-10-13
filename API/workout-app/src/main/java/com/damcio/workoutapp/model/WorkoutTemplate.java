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
public class WorkoutTemplate {
    @Id
    @SequenceGenerator(
            name = "workout_template_id_sequence",
            sequenceName = "workout_template_id_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "workout_template_id_sequence"
    )
    private Integer id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "workoutTemplate", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<WorkoutTemplateSet> workoutTemplateSets;
}

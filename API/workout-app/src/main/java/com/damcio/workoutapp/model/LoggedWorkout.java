package com.damcio.workoutapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class LoggedWorkout {
    @Id
    @SequenceGenerator(
            name = "logged_workout_id_sequence",
            sequenceName = "logged_workout_id_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "logged_workout_id_sequence"
    )
    private Integer id;

    @Column(nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "loggedWorkout", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LoggedWorkoutSet> loggedWorkoutSets;
}

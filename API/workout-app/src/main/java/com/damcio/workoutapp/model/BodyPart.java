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
public class BodyPart {
    @Id
    @SequenceGenerator(
            name = "body_part_id_sequence",
            sequenceName = "body_part_id_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "body_part_id_sequence"
    )
    private Integer id;

    @Column(nullable = false)
    private String name;
}

package by.heretic.exercise.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDate;

import static jakarta.persistence.FetchType.EAGER;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Data
@FieldNameConstants
public class Exercise {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long exerciseId;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "exercise_name_id")
    private ExerciseName exerciseName;

    private Integer setCount;
    private Integer repetition;
    private LocalDate exerciseDate;

}
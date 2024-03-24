package by.heretic.coach.domain.dto.strength_exercise;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class StrengthExerciseCreateDto {

    private Long strengthExerciseNameId;
    private Integer setCount;
    private Integer repetition;
    private LocalDate strengthExerciseDate;

}
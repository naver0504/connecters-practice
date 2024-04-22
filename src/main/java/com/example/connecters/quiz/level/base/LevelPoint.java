package com.example.connecters.quiz.level.base;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LevelPoint {

    private int beginnerPoint;
    private int juniorPoint;
    private int middlePoint;
    private int semiProfessionalPoint;
    private int professionalPoint;

    public int getPointFromLevel(final Level level) {
       return switch (level) {
            case PROFESSIONAL -> professionalPoint;
            case SEMI_PROFESSIONAL -> semiProfessionalPoint;
            case MIDDLE -> middlePoint;
            case JUNIOR -> juniorPoint;
            case BEGINNER -> beginnerPoint;
        };
    }
}

package com.example.connecters.quiz.level.entity;

import com.example.connecters.quiz.level.base.Level;
import com.example.connecters.quiz.level.base.LevelQuizDetail;
import jakarta.persistence.*;
import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
public class LevelQuizEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private Level level;

    @Enumerated(EnumType.STRING)
    private LevelQuizDetail levelQuizDetail;

    private int point;

    public LevelQuizEntity(Level level, LevelQuizDetail levelQuizDetail) {
        this.level = level;
        this.levelQuizDetail = levelQuizDetail;
        this.point = levelQuizDetail.getPoint(level);
    }
}

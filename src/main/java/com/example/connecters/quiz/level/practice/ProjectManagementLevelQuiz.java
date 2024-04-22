package com.example.connecters.quiz.level.practice;

import com.example.connecters.quiz.level.base.Level;
import com.example.connecters.quiz.level.base.LevelPoint;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ProjectManagementLevelQuiz implements EnumType {

    NEW_PROJECT("새로운 프로젝트 기획시, 프로젝트 계획안과  달성 목표를 명확히 작성하고 정립할 수 있나요?", new LevelPoint(0, 2, 3, 4, 5)),
    AGILE("애자일 방법론에 대해 알고 있을 때", new LevelPoint(0, 2, 3, 4, 5)),
    COMMUNICATION("커뮤니케이션에 대해 알고 있을 때", new LevelPoint(0, 1, 2, 3, 4)),
    LEADERSHIP("리더십에 대해 알고 있을 때",  new LevelPoint(0, 2, 3, 4, 5));

    private final String description;
    private final LevelPoint point;

    @Override
    public String getName() {
        return this.name();
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPoint(Level level) {
        return point.getPointFromLevel(level);
    }
}

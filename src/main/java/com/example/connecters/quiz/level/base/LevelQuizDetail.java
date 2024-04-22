package com.example.connecters.quiz.level.base;

import com.example.connecters.quiz.level.base.category.SubCategory;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public enum LevelQuizDetail {

    NEW_PROJECT("새로운 프로젝트 기획시, 프로젝트 계획안과  달성 목표를 명확히 작성하고 정립할 수 있나요?", SubCategory.PROJECT_MANAGEMENT, new LevelPoint(0, 2, 3, 4, 5)),
    AGILE("애자일 방법론에 대해 알고 있을 때", SubCategory.PROJECT_MANAGEMENT, new LevelPoint(0, 2, 3, 4, 5)),
    COMMUNICATION("커뮤니케이션에 대해 알고 있을 때", SubCategory.PROJECT_MANAGEMENT, new LevelPoint(0, 1, 2, 3, 4)),
    LEADERSHIP("리더십에 대해 알고 있을 때", SubCategory.PROJECT_MANAGEMENT, new LevelPoint(0, 2, 3, 4, 5)),

    MARKET_RESEARCH("서비스를 기획하거나 개선할 때 서베이. 논문. 기사 등 각종 커뮤니티를 통해 철저한 시장 조사 및 분석 과정을 거치나요?",SubCategory.RESEARCH, new LevelPoint(0, 2, 3, 4, 5)),
    VOC("사용자 VoC를 여러 방면으로 수집하고 이를 바탕으로 서비스를 개선해본 경험이 있나요?",SubCategory.RESEARCH, new LevelPoint(0, 2, 3, 4, 5));

    private final String description;
    private final SubCategory subCategory;
    private final LevelPoint point;

    public int getPoint(final Level level) {
        return point.getPointFromLevel(level);
    }
}

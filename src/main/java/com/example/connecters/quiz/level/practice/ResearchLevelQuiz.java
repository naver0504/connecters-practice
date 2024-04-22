package com.example.connecters.quiz.level.practice;

import com.example.connecters.quiz.level.base.Level;
import com.example.connecters.quiz.level.base.LevelPoint;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ResearchLevelQuiz implements EnumType {

    MARKET_RESEARCH("서비스를 기획하거나 개선할 때 서베이. 논문. 기사 등 각종 커뮤니티를 통해 철저한 시장 조사 및 분석 과정을 거치나요?", new LevelPoint(0, 2, 3, 4, 5)),
    VOC("사용자 VoC를 여러 방면으로 수집하고 이를 바탕으로 서비스를 개선해본 경험이 있나요?", new LevelPoint(0, 2, 3, 4, 5));

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

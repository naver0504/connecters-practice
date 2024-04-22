package com.example.connecters.quiz.level.practice;

import com.example.connecters.quiz.level.base.Level;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PracticeQuizRequestDto {

    private List<LevelQuizDto> levelQuizDtos = new ArrayList<>();

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    static class LevelQuizDto {
        private String levelQuiz;
        private Level level;
    }
}

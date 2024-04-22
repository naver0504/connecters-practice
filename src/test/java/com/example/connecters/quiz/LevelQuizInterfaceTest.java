package com.example.connecters.quiz;

import com.example.connecters.QuizRequestDto;
import com.example.connecters.quiz.level.base.Level;
import com.example.connecters.quiz.level.service_design.ProjectManagementQuiz;
import com.example.connecters.quiz.level.service_design.ResearchQuiz;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.example.connecters.quiz.level.service_design.ResearchQuiz.MARKET_RESEARCH;

class LevelQuizInterfaceTest {

    @Test
    public void test() {
        ProjectManagementQuiz agile = ProjectManagementQuiz.AGILE;
        ProjectManagementQuiz newProject = ProjectManagementQuiz.NEW_PROJECT;


        List<QuizRequestDto.QuizRequestDetailDto> quizRequestDetailDtoList = List.of(
                new QuizRequestDto.QuizRequestDetailDto(agile.name(), Level.BEGINNER),
                new QuizRequestDto.QuizRequestDetailDto(newProject.name(), Level.PROFESSIONAL)
        );

        ObjectMapper objectMapper = new ObjectMapper();
        QuizRequestDto quizRequestDto = new QuizRequestDto(quizRequestDetailDtoList);
        try {
            String json = objectMapper.writeValueAsString(quizRequestDto);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void mapperTest() {
        ResearchQuiz researchQuiz = MARKET_RESEARCH;
        String name = researchQuiz.getName();

        LevelQuizInterface levelQuizInterface = LevelQuizMapper.toLevelQuiz(name, MARKET_RESEARCH.getSubCategory().getCategory(), MARKET_RESEARCH.getSubCategory());
        System.out.println(levelQuizInterface);
        assertEquals(researchQuiz, levelQuizInterface);
    }

}
package com.example.connecters;

import com.example.connecters.quiz.level.base.category.Category;
import com.example.connecters.quiz.level.base.category.SubCategory;
import com.example.connecters.quiz.level.entity.LevelQuizEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class QuizController {



    @PostMapping(value = "/quiz/{quizCategory}/{quizSubCategory}", consumes = "application/json")
    public void getQuiz(final @PathVariable("quizCategory") Category quizCategory,
                        final @PathVariable("quizSubCategory") SubCategory quizSubCategory,
                        final @RequestBody QuizRequestDto quizRequestDto) {

        List<LevelQuizEntity> levelQuizEntities = quizRequestDto.getQuizRequestDetailDtoList().stream()
                .filter(quizRequestDetailDto -> quizRequestDetailDto.validate(quizCategory, quizSubCategory))
                .map(quizRequestDetailDto -> new LevelQuizEntity(quizRequestDetailDto.getLevel(), quizRequestDetailDto.getLevelQuizDetail()))
                .collect(Collectors.toList());

        int pointSum = levelQuizEntities.stream().mapToInt(LevelQuizEntity::getPoint).sum();

        log.info("pointSum: {}", pointSum);
        levelQuizEntities.forEach(levelQuizEntity -> log.info("levelQuizEntity: {}", levelQuizEntity));


    }
}

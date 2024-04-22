package com.example.connecters.quiz.level.practice;

import com.example.connecters.quiz.level.base.category.Category;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static com.example.connecters.quiz.level.practice.PracticeQuizRequestDto.*;

public class EnumTypeMapper {

    public static List<EnumTypeValue> getEnumTypeValue(Category category, PracticeSubCategory subCategory, List<LevelQuizDto> levelQuizDtos) {
        Map<String, ? extends EnumType> enumTypeMap = subCategory.getEnumTypeMap(category);

        List<EnumTypeValue> list = levelQuizDtos.stream()
                .filter(validateEnumTypeValue(enumTypeMap))
                .map(quizDto -> new EnumTypeValue(enumTypeMap.get(quizDto.getLevelQuiz()), category, subCategory, quizDto.getLevel()))
                .toList();

        return list;
    }

    private static Predicate<LevelQuizDto> validateEnumTypeValue(Map<String, ? extends EnumType> enumTypeMap) {
        return quizDto -> {
            if (!enumTypeMap.containsKey(quizDto.getLevelQuiz())) {
                throw new IllegalArgumentException("Invalid levelQuiz");
            }
            return true;
        };
    }
}

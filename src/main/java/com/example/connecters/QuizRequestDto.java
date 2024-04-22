package com.example.connecters;

import com.example.connecters.quiz.level.base.Level;
import com.example.connecters.quiz.level.base.LevelQuizDetail;
import com.example.connecters.quiz.level.base.category.Category;
import com.example.connecters.quiz.level.base.category.SubCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QuizRequestDto {

    private List<LevelQuizDto> quizRequestDetailDtoList = new ArrayList<>();


    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    static class LevelQuizDto {
        private LevelQuizDetail levelQuizDetail;
        private Level level;

        boolean validate(Category category, SubCategory subCategory) {
            if (!levelQuizDetail.getSubCategory().isEquals(subCategory, category)) {
                throw new IllegalArgumentException("Invalid subCategory");
            }
            return true;
        }
    }
}

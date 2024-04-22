package com.example.connecters.quiz.level.practice;

import com.example.connecters.quiz.level.base.category.Category;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
public enum PracticeSubCategory {

        PROJECT_MANAGEMENT("프로젝트 관리 역량 체크", Category.SERVICE_DESIGN, Arrays.asList(ProjectManagementLevelQuiz.values())),
        RESEARCH("리서치 역량 체크", Category.SERVICE_DESIGN, Arrays.asList(ResearchLevelQuiz.values())),;

        private final String description;
        private final Category category;
        private final List<? extends EnumType> enumTypes;

        public List<? extends EnumType> getValidEnumTypes(Category category) {
            if(this.category != category) {
                throw new IllegalArgumentException("Invalid category");
            }
            return enumTypes;
        }

        public Map<String, ? extends EnumType> getEnumTypeMap(Category category) {
            return this.getValidEnumTypes(category).stream()
                    .collect(Collectors.toMap(EnumType::getName, enumType -> enumType));
        }
}

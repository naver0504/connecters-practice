package com.example.connecters.quiz.level.base.category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Getter
@RequiredArgsConstructor
public enum SubCategory {

    PROJECT_MANAGEMENT("프로젝트 관리 역량 체크", Category.SERVICE_DESIGN),
    RESEARCH("리서치 역량 체크", Category.SERVICE_DESIGN),
    SERVICE_DESIGN_CHECK("서비스 설계 역량", Category.SERVICE_DESIGN),
    DATA_ANALYSIS("데이터 분석 역량 체크", Category.SERVICE_DESIGN),


    CODE_QUALITY("코드 품질 체크", Category.BACKEND_DEVELOPMENT),
    PERFORMANCE("성능 체크", Category.BACKEND_DEVELOPMENT),
    SECURITY("보안 체크", Category.BACKEND_DEVELOPMENT);

    private final String description;
    private final Category category;

    public boolean isEquals(SubCategory subCategory, Category category) {
        return this == subCategory && this.category == category;
    }

    public List<SubCategory> getSubCategoryList(Category category) {
        return Arrays.stream(SubCategory.values())
                .filter(subCategory -> subCategory.getCategory() == category)
                .toList();
    }
}

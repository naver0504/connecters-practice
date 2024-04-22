package com.example.connecters.quiz.level.practice;

import com.example.connecters.quiz.level.base.Level;
import com.example.connecters.quiz.level.base.category.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class EnumTypeValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String enumType;
    private Category category;
    private PracticeSubCategory subCategory;
    private Level level;
    private int point;

    public EnumTypeValue(EnumType enumType, Category category, PracticeSubCategory subCategory, Level level) {
        this.enumType = enumType.getName();
        this.category = category;
        this.subCategory = subCategory;
        this.level = level;
        this.point = enumType.getPoint(level);
    }


}

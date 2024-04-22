package com.example.connecters.quiz.level.practice;

import com.example.connecters.quiz.level.base.category.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping("/practice")
public class PracticeQuizController {



    @PostMapping(value = "/quiz/{category}/{subCategory}")
    public void getQuiz(final @PathVariable("category") Category category,
                        final @PathVariable("subCategory") PracticeSubCategory subCategory,
                        final @RequestBody PracticeQuizRequestDto quizRequestDto) {


        //to Map
        List<EnumTypeValue> enumTypeValue = EnumTypeMapper.getEnumTypeValue(category, subCategory, quizRequestDto.getLevelQuizDtos());
        int sum = enumTypeValue.stream().mapToInt(EnumTypeValue::getPoint).sum();


    }
}

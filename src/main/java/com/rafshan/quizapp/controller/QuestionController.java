package com.rafshan.quizapp.controller;

import com.rafshan.quizapp.Questions;
import com.rafshan.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Questions> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("dificulty/{level}")
    public List<Questions> getQuestionsByDificulty(@PathVariable String level) {
        return questionService.getQuestionByDificulty(level);

    }

}

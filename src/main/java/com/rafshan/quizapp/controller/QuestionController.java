package com.rafshan.quizapp.controller;

import com.rafshan.quizapp.Questions;
import com.rafshan.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("add")
    public String addQuestion(@RequestBody Questions questions){
        return questionService.addQuestion(questions);
    }

}

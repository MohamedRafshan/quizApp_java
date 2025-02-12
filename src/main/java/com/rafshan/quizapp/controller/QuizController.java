package com.rafshan.quizapp.controller;

import com.rafshan.quizapp.service.QuizService;
import com.rafshan.quizapp.model.Questions;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String dificulty, @RequestParam Integer numQ, @RequestParam String title) {
    return quizService.creteQuiz(dificulty, numQ, title);
    }
}

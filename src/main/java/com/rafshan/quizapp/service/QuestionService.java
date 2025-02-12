package com.rafshan.quizapp.service;

import com.rafshan.quizapp.Dao.QuestionDao;
import com.rafshan.quizapp.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao ;
    public List<Questions> getAllQuestions() {

        return questionDao.findAll();

    }

    public List<Questions> getQuestionByDificulty(String level) {
        return questionDao.findByDificulty(level);
    }

    public String addQuestion(Questions questions) {
        questionDao.save(questions);
        return "Question added";
    }
}

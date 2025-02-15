package com.rafshan.quizapp.service;

import com.rafshan.quizapp.Dao.QuestionDao;
import com.rafshan.quizapp.Dao.QuizDao;
import com.rafshan.quizapp.model.QuestionWrapper;
import com.rafshan.quizapp.model.Questions;
import com.rafshan.quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> creteQuiz(String dificulty, Integer numQ, String title) {

        List <Questions> questions = questionDao.findRndomQuestionByDificulty(dificulty,numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("Quiz Saved", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Optional<Quiz> quiz = quizDao.findById(id);
        List<Questions> questionsFromDb = quiz.get().getQuestions();
        List<QuestionWrapper> questionForUser = new ArrayList<>();

        for (Questions q : questionsFromDb) {
            QuestionWrapper qw = new QuestionWrapper(q.getId() , q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
            questionForUser.add(qw);
        }


        return new ResponseEntity<>(questionForUser , HttpStatus.OK);
    }
}

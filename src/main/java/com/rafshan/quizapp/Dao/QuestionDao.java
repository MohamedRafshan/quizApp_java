package com.rafshan.quizapp.Dao;

import com.rafshan.quizapp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Questions , Integer> {

    // Find questions by difficulty (keeping the name "dificulty")
    List<Questions> findByDificulty(String dificulty);

    // Find random questions by difficulty with a specified number (numQ as limit)
    @Query(value = "SELECT * FROM questions q WHERE q.dificulty = :dificulty ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Questions> findRndomQuestionByDificulty(String dificulty, Integer numQ);
}

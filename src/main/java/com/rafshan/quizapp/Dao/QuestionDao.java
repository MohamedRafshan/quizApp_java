package com.rafshan.quizapp.Dao;

import com.rafshan.quizapp.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Questions , Integer> {

    List<Questions> findByDificulty(String level);
}

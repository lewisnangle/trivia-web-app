package com.trivia.api.dao;

import com.trivia.api.model.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface QuestionDAO {

  List<Question> getQuestions();

  Question getQuestionById(int id);

  List<Question> getQuestionsByCategoryId(int id);
}

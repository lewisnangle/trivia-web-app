package com.trivia.api.service;

import com.trivia.api.model.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getQuestions();

    Question getQuestionById(int id);

    List<Question> getQuestionsByCategoryId(int id);
}

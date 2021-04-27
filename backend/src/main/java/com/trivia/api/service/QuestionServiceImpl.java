package com.trivia.api.service;

import com.trivia.api.dao.QuestionDAO;
import com.trivia.api.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

  @Autowired QuestionDAO questionDAO;

  @Override
  public List<Question> getQuestions() {
    return questionDAO.getQuestions();
  }

  @Override
  public Question getQuestionById(int id) {
    return questionDAO.getQuestionById(id);
  }

  @Override
  public List<Question> getQuestionsByCategoryId(int id) {
    return questionDAO.getQuestionsByCategoryId(id);
  }
}

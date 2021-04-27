package com.trivia.api.controller;

import com.trivia.api.model.Question;
import com.trivia.api.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {

  @Autowired
  QuestionService questionService;

  @GetMapping("/api/questions")
  public List<Question> getQuestions() {
      return questionService.getQuestions();
  }

  @GetMapping("/api/questions/{id}")
  public Question getQuestionById(@PathVariable int id){
    return questionService.getQuestionById(id);
  }

  @GetMapping("/api/questions/category/{id}")
  public List<Question> getQuestionsByCategoryId(@PathVariable int id){
    return questionService.getQuestionsByCategoryId(id);
  }


}

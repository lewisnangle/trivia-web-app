package com.trivia.api.dao;

import com.trivia.api.mapper.QuestionMapper;
import com.trivia.api.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionDAOImpl implements QuestionDAO {

  @Autowired JdbcTemplate jdbcTemplate;

  @Override
  public List<Question> getQuestions() {
    String sql = "SELECT id, category_id, question, answer FROM questions";

    return jdbcTemplate.query(sql, new QuestionMapper());
  }

  @Override
  public Question getQuestionById(int id) {
    String sql = "SELECT id, category_id, question, answer FROM questions WHERE id = ?";

    return (Question) jdbcTemplate.queryForObject(sql,new QuestionMapper(),id);
  }

  @Override
  public List<Question> getQuestionsByCategoryId(int id) {
    String sql = "SELECT id, category_id, question, answer FROM questions WHERE category_id = ?";

    return jdbcTemplate.query(sql, new QuestionMapper(),id);
  }
}

package com.trivia.api.mapper;

import com.trivia.api.model.Question;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet resultSet, int i) throws SQLException {
    Question question = new Question();
    question.setId(resultSet.getInt("id"));
    question.setCategoryId(resultSet.getInt("category_id"));
    question.setQuestion(resultSet.getString("question"));
    question.setAnswer(resultSet.getString("answer"));
    return question;
  }
}

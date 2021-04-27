package com.trivia.api.mapper;

import com.trivia.api.model.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper {

  @Override
  public Object mapRow(ResultSet resultSet, int i) throws SQLException {
    Category category = new Category();
    category.setId(resultSet.getInt("id"));
    category.setName(resultSet.getString("name"));

    return category;
  }
}

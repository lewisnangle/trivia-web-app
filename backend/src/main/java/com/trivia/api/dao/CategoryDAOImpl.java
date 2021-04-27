package com.trivia.api.dao;

import com.trivia.api.mapper.CategoryMapper;
import com.trivia.api.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

  @Autowired JdbcTemplate jdbcTemplate;

  @Override
  public List<Category> getCategories() {

    String sql = "SELECT id, name from categories";

    return jdbcTemplate.query(sql, new CategoryMapper());
  }
}

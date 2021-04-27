package com.trivia.api.service;

import com.trivia.api.dao.CategoryDAO;
import com.trivia.api.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

  @Autowired CategoryDAO categoryDAO;

  @Override
  public List<Category> getCategories() {
    return categoryDAO.getCategories();
  }
}

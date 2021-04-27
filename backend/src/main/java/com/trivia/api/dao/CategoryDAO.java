package com.trivia.api.dao;

import com.trivia.api.model.Category;

import java.util.List;

public interface CategoryDAO {

  List<Category> getCategories();
}

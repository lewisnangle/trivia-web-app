package com.trivia.api.controller;

import com.trivia.api.model.Category;
import com.trivia.api.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

  @Autowired CategoryService categoryService;

  @GetMapping("/api/categories")
  public List<Category> getCategories() {
    return categoryService.getCategories();
  }


}

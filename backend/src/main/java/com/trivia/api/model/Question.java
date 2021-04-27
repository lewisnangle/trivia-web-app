package com.trivia.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

  private int id;
  private int categoryId;
  private String question;
  private String answer;
}

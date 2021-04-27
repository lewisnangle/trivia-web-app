DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS questions;

CREATE TABLE categories (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);


CREATE TABLE questions (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  category_id INT NOT NULL,
  question VARCHAR(250) NOT NULL,
  answer VARCHAR(250) NOT NULL
);
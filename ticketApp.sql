CREATE DATABASE IF NOT EXISTS ticket_app;
USE ticket_app;

CREATE TABLE IF NOT EXISTS users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100) NOT NULL UNIQUE,
  password VARCHAR(100) NOT NULL
);

INSERT INTO users (username, password) VALUES ('ab', '12');
show tables;

select * from users;


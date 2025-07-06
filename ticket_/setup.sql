CREATE DATABASE IF NOT EXISTS ticket_app;
USE ticket_app;
CREATE USER IF NOT EXISTS 'admin'@'localhost' IDENTIFIED BY 'admin123';

GRANT ALL PRIVILEGES ON ticket_app.* TO 'admin'@'localhost';

CREATE TABLE IF NOT EXISTS users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100) NOT NULL UNIQUE,
  password VARCHAR(100) NOT NULL
);

INSERT INTO users (username, password) VALUES ('aditi', '44');
show tables;
FLUSH PRIVILEGES;

select * from users;
DELETE FROM `users` WHERE USERNAME="aditi";
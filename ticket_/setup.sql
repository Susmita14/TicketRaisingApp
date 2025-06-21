CREATE DATABASE IF NOT EXISTS ticket_app;

CREATE USER IF NOT EXISTS 'admin'@'localhost' IDENTIFIED BY 'admin123';

GRANT ALL PRIVILEGES ON ticket_app.* TO 'admin'@'localhost';

FLUSH PRIVILEGES;
 
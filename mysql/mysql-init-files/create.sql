CREATE DATABASE IF NOT EXISTS mydb DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

set GLOBAL general_log='ON';
show variables like 'general%';

use mydb;

CREATE TABLE member(
  id VARCHAR(255) PRIMARY KEY,
  name VARCHAR (255),
  age INTEGER
);

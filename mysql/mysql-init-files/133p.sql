CREATE DATABASE IF NOT EXISTS mydb DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

use mydb;

create table board
(
    id   int not null auto_increment primary key,
    data varchar(255)
);

insert into board(data)
values ('A');
insert into board(data)
values ('B');
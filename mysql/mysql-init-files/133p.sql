CREATE DATABASE IF NOT EXISTS mydb;

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
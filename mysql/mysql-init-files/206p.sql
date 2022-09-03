CREATE DATABASE IF NOT EXISTS mydb DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

use mydb;

create table member6
(
    member_id int auto_increment not null,
    team_id   int,
    username  varchar(255),
    primary key (member_id)
);

create table team6
(
    team_id int auto_increment not null,
    name varchar(255),
    primary key (team_id)
);

alter table member6 add constraint fk_member6_team6 foreign key (team_id) references team6;

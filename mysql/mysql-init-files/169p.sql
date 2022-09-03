CREATE DATABASE IF NOT EXISTS mydb DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

use mydb;

create table member5
(
    member_id varchar(255) not null,
    team_id   varchar(255),
    username  varchar(255),
    primary key (member_id)
);

create table team5
(
    team_id varchar(255) not null,
    name varchar(255),
    primary key (team_id)
);

alter table member5 add constraint fk_member5_team5 foreign key (team_id) references team5(team_id);

CREATE DATABASE people CHARACTER SET utf8 COLLATE utf8_general_ci;

use people;

create table Admin(
    id int primary key auto_increment,
    name varchar(20) ,
    password varchar(20),
    gender char (20),
    salary double
);
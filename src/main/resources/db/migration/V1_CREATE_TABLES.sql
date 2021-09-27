create table hibernate_sequence (
    next_val bigint
) engine=MyISAM;

insert into hibernate_sequence values ( 1 );
insert into hibernate_sequence values ( 1 );

CREATE TABLE userEntity (
    id BIGINT NOT NULL AUTO_INCREMENT,
    userName varchar(64),
    userSurname varchar(64),
    userThirdName varchar(64),
    email varchar(64),
    PRIMARY KEY (id)
) engine=MyISAM;
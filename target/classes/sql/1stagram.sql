create table member(
id int ,
username varchar2(30),
email varchar2(30) CONSTRAINT pk primary key,
password varchar2(30) not null,
birth varchar2(30) not null,
address varchar(30) not null,
create_at DATE
);

create table board(
id int CONSTRAINT board_pk primary key,
email varchar2(30),
content varchar2(100),
recommand int,
created_at DATE,
update_at Date
);

create table board_comment (
board_id int,
username varchar(30),
content varchar(50),
create_at date,
update_at date
);

ALTER TABLE board ADD CONSTRAINT fk_User_email FOREIGN Key(email) REFERENCES member(email);
ALTER TABLE board_comment ADD CONSTRAINT fk_board_id FOREIGN KEY(board_id) REFERENCES board(id);

/* 여기까지 했습니다.*/
create table friend(
id int,
username varchar(20)
);



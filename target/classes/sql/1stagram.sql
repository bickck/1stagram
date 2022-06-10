CREATE SEQUENCE USER_SEQ INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE BOARD_SEQ INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE IMAGE_SEQ INCREMENT BY 1 START WITH 1;

CREATE TABLE MEMBER(
id int ,
username VARCHAR2,
email VARCHAR2 CONSTRAINT pk primary key,
password VARCHAR2(20) not null,
birth VARCHAR2 not null,
address VARCHAR2 not null,
create_at DATE
);

CREATE TABLE board(
id INT CONSTRAINT board_pk primary key,
email VARCHAR2,
content VARCHAR2,
recommand INT,
created_at DATE,
update_at DATE
);

CREATE TABLE board_comment (
comment_id INT,
username VARCHAR2,
content VARCHAR2,
create_at DATE,
update_at DATE
);

CREATE TABLE board_image(
image_id INT,
board_image_id INT,
file_location VARCHAR2,
file_original_name VARCHAR2,
create_at DATE
);

CREATE TABLE friend(
id INT,
friend_name VARCHAR2,
email VARCHAR2
);

ALTER TABLE board ADD CONSTRAINT fk_user_email FOREIGN Key(email) REFERENCES member(email);
ALTER TABLE board_comment ADD CONSTRAINT fk_board_id FOREIGN KEY(board_id) REFERENCES board(id);
ALTER TABLE board_image ADD CONSTRAINT fk_board_img_id FOREIGN KEY(comment_id) REFERENCES board(id);
ALTER TABLE friend ADD CONSTRAINT fk_friend_email FOREIGN KEY (email) REFERENCES member(email);

/* 여기까지 했습니다.*/





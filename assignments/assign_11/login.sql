Create table login(
username varchar(20),
password varchar(20),
CONSTRAINT login_username_pk PRIMARY KEY (username)
);

Insert into login values('admin', '12345');
Insert into login values('administrator', 'admin');
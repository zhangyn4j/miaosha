create table user_info
(
	id int auto_increment
		primary key,
	name varchar(64) default '' not null,
	gender tinyint default '0' not null comment '1 男 2 女
	',
	age int not null,
	telphone varchar(16) not null,
	register_mode varchar(64) not null comment '注册方式',
	third_party_id varchar(64) not null comment '第三方id'
)
comment '用户信息表'
;

create table user_passworld
(
	id int auto_increment
		primary key,
	encrpt_password varchar(128) not null,
	user_id int not null
)
;


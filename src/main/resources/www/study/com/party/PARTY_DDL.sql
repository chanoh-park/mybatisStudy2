drop table t_contact_point;
drop table t_contact_point_type;
drop table t_party;


-- loging_id, name, pwd, birth_date, party_type, gender
create table t_party (
	login_id		varchar2(50),
	pwd				varchar2(200),
	name			varchar2(50),
	birth_date		date,
	join_date		date,
	party_type		varchar2(50),
	gender			varchar2(50),
	primary key(login_id)
);

insert into t_party (login_id, pwd, name, birth_date, join_date, party_type, gender) values ('a', 'a', '홍길동', '1500.01.01', '2000.01.01', 'PERSON', 'mail');


-- 연락처 유형
-- name, validation_rex
create table t_contact_point_type (
	name			varchar2(50) primary key,
	validation_rex	varchar2(100)
);

insert into t_contact_point_type (name, validation_rex) values ('주소', '\d{3}[\-]\d{3}');
insert into t_contact_point_type (name, validation_rex) values ('email', '/^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i');
insert into t_contact_point_type (name, validation_rex) values ('phone', '/^\d{3}-\d{3,4}-\d{4}$/');


-- Party별 연락처 목록. 1:N 관계 연습
create table t_contact_point (
	party_id		varchar2(50),
	type_name 		varchar2(50),
	contact_point 	varchar2(50),
	primary key (party_id, type_name) 
);

insert into t_contact_point (party_id, type_name, contact_point) values ('a', '주소', '한양');
insert into t_contact_point (party_id, type_name, contact_point) values ('a', 'email', 'a@한양.com');

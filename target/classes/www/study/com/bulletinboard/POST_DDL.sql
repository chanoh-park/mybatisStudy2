drop table t_bulletin_board;
drop table t_post;


-- 게시판 : 자유게시판, 공지사항, FAQ, ...
-- id, name
create table t_bulletin_board (
	id				number(10),
	name			varchar2(50),
	primary key(id)
);

insert into t_bulletin_board (id, name)
	values(-1, '자유게시판');
	

--게시글
-- hierarchy_id, hierarchy_id, content, post_type, bb_id, title
create table t_post (
	hierarchy_id	varchar2(2000),
	writer_id		varchar2(50),
	content			varchar2(2000),
	reg_date		date default sysdate,				-- 등록일 년월일시분초
	update_date		date default sysdate,				-- 수정일 년월일시분초
	post_type		varchar2(50),		--POST, REPLY
	bb_id			number(10),
	title			varchar2(500),
	primary key(hierarchy_id)
);

alter table add CONSTRAINT FK_post_bb FOREIGN KEY(bb_id) REFERENCES t_bulletin_board(id);
alter table add CONSTRAINT FK_post_party FOREIGN KEY(writer_id) REFERENCES t_party(login_id);
	
insert into t_post (hierarchy_id, bb_id, writer_id, post_type, title, content)
	values('-1', -1, 'a', 'POST', '안녕', '하세요');
insert into t_post (hierarchy_id, bb_id, writer_id, post_type, title, content)
	values('-2', -1, 'a', 'POST', '호갱님', '많이 사세요');
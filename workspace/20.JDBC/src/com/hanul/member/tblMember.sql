--회원관리 프로그램 작성  : JDBC

--기존에 생성된 tblMember 제거 
drop table tblMember;

--tblMember 테이블 생성 
create table tblMember(
    num number(5) primary key not null,
    name varchar2(20),
    age number(3),
    addr varchar2(50),
    tel varchar2(20)
);

--임의의 레코드 삽입
insert into tblMember(num,name,age,addr,tel)
    values(1,'홍길동',33,'광주시 서구 농성동','010-1111-1111');

insert into tblMember values(2,'박문수',30,'광주시 서구 경열로','010-2222-2222');
 
insert into tblMember values(3,'hanul','27','광주시 서구 쌍촌동','062-362-7797'); 

insert into tblMember values(4,'HANUL','27','광주시 서구 쌍촌동','062-362-7798'); 

--전체 레코드 검색
select num, name,age,addr,tel  from tblMember;

select * from tblMember;

--commit insert delete update  쿼리 수행한 후 변경된 내용을 최종적으로 테이블 반영 (저장)
commit;


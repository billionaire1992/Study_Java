--인코딩 설정 변경 : 도구 > 환경설정 > 인코딩 검색 → UTF-8
--글꼴 변경 : 도구 > 환경설정 > 글꼴 검색 

--데이터 정의어
--tblMember 테이블 생성  : 명령문을 작성 후 범위지정 > Ctrl + Enter 
create table tblMember(
    num number,
    name varchar2(10),
    age number,
    addr varchar2(50),
    tel varchar2(20)
);

--tblMember 테이블에 phone 필드(컬럼) 추가 : 명령문을 작성 후 F5 입력 
alter table tblMember add phone varchar2(20);

--tblMember 테이블의 phone 필드의 크기변경 
alter table tblMember modify(phone varchar2(15));

--tblMember 테이블의 phone 필드의 이름을 mobilephone 변경 
alter table tblMember rename column phone to mobilephone;

--tblMember 테이블의 mobilephone 필드 삭제
alter table tblMember drop column mobilephone;

--tblMember 테이블 제거 
drop table tblMember

-- 데이터 조작어 (DML)
-- 레코드 (행, 튜플, 자료)를 삽입(입력) : insert 
insert into tblMember(num, name, age, addr, tel)
    values(1, '임승진', 30, '광주시 서구 농성동', '010-1111-1111');
insert into tblMember (tel,addr,age,num,name)
    values('010-2222-2222', '광주시 남구 봉선동' , 50, 2, '김길동');

insert into tblMember values(3,'나길동',40,'광주시 북구 용봉동','010-3333-3333');

insert into tblMember(num,name,age)
    values (4, '박길동',60);

--4번 레코드 정보를 삭제 :  delete 
delete from tblMember where num =2;

--전체 레코드를 삭제
delete from tblMember;

--레코드 정보를 갱신(수정) : update
--4번 레코드의 정보를 갱신(addr, tel 추가)
update tblMember 
    set addr ='광주시 광산구 신가동', tel='010-4444-4444'
    where num =4;
    
--3번 레코드의 정보를 수정(주소 수정)
update tblMember
    set addr='서울시 강서구 화곡동',name='홍길동'
    where num = 3;
    
--레코드 검색 : select
select all num, name, addr, age,tel from tblMember;                         /*전체 레코드 출력*/

select distinct num,name,age,addr,tel from tblMember;                  /*중복 자료는 1번만 검색(제외)*/ 
   
select * from tblMember;    /*전체 레코드 출력*/
  
--조건을 이용한 검색 : where 절
--이름이 홍길동인 회원을 출력하시오 
select * from tblMember where name = '홍길동';
  
--이름이 홍길동인 회원의 이름, 나이, 주소만 출력
select name, age, addr from tblMember where name='홍길동';
   
--주소에 특정 글자가 포함된 회원을 출력  ▶  like 연산자 
select * from tblMember where addr like '광%';   /*광으로 시작하는 레코드 출력 */
select * from tblMember where addr like'%서구%';  /* 서구라는 글자가 포함된 레코드 출력 */
select * from tblMember where addr like '%동';            /*동으로 끝나는 레코드 출력 */
    
--나이가 40세 이상인 회원만 출력     
select * from tblMember where age >=40;   

--나이가 40세 이상인 회원의 이름, 주소, 전화번호 출력
select name,addr,tel from tblMember where age >=40;
    
--나이가 30세~50세 사이의 회원만 출력 
select *from tblMember where age >=30 and age <=50;
select * from tblMember where age between 30 and 50;

--내장함수(count, sum, avg, max, min 등)
select count(name) from tblMember;  /* name개수 */
select sum(age) as ageTotal from tblMember;   /* age 합계 */
select avg(age) from tblMember;  /*age 평균*/
select avg(age) as ageAvg from tblMember;
select age +2 from tblMember;   /*기존의 age값에 2를 더한 후 출력 */
select avg(age) from tblMember where addr like '%서구%';   /*주소에 서구가 포함된 데이터의 나이의 평균값 출력 */

--기타연산 
--num값이 1 또는 3인 데이터 검색
select * from tblMember where num = 1 or num =3 ;
select * from tblMember where num in(1,3);

--날짜 데이터 검색 
select sysdate from dual;
select to_char(sysdate,'yyyy.MM.dd')as today from dual;


    
--데이터  제어어 (DCL)
--commit : 수정한 사항을 테이블에 최종적으로 저장 (반영) → insert , delete, update
commit;

--rollback : 수정된 사항을 취소 (되돌리기)  → commit 명령 실행전에 사용
rollback;




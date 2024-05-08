drop table tblMember;

create table tblMember(num number(5) primary key not null,
   ID varchar2(50),
    pw varchar2(50),
    name varchar2(20),
    admin varchar2(1),
   email varchar2(100)
    );
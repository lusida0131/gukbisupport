create view vw__Book
as select *
from book
where bookname like '%축구%';

select *
from vw__book;

create view vw_Customer
as select *
from customer
where address like '%대한민국%';

select *
from vw_Customer;

create view vw_Orders (orderid, custid, name, bookid, bookname, saleprice, orderdate)
as select od.orderid, od.custid, cs.name, od.bookid, bk.bookname, od.saleprice, od.orderdate
from Orders od, Customer cs, Book bk
where od.custid=cs.custid AND od.bookid=bk.bookid;

select orderid, bookname, saleprice
from vw_Orders
where name='김연아';

create or replace view  vw_Customer(custid, name, address)
as select custid, name, address
from Customer
where address like '%영국%';

select *
from vw_customer;

drop view vw_Customer;

create index ix_Book on Book(bookname);

create index ix_Book2 on Book(publisher, price);
show index from Book;

select *
from book
where publisher='대한미디어' and price>=30000;

analyze table book;

drop index ix_Book on book;

drop table if exists summer;
create table summer
(sid integer,
class varchar(20),
price integer);

insert into summer values (100,'fortran',20000);
insert into summer values (150,'pascal',15000);
insert into summer values (200, 'C',10000);
insert into summer values (250,'fortran',20000);
select *
from summer;

select sid,class
from summer;

select price
from summer
where class='c';

select distinct class
from summer
where price=(select max(price) from summer);

select count(*), sum(price)
from summer;

select price 'c수강료'
from summer
where class like 'c';
set sql_safr_updates=0;
delete from summer
where sid=200;

select price 'c수강료'
from summer
where class='c';
insert into summer values(200,'c',10000);

insert into summer values(null, 'java', 25000);
select *
from summer;
select count(*)'수강인원'
from summer;
select count(sid)'수강인원'
from summer;
select count(*)'수강인원'
from summer
where sid is not null;

update summer
set price=15000
where class='fortran';

select *
from summer;

select distinct price 'fortran 수강료'
from summer
where class like 'fortran';

update summer
set price=20000
where class like'fortran';

update summer
set price=15000
where class like'fortran' and sid=100;

select *
from summer;

select price 'fortran수강료'
from summer
where class like 'fortran';

update summer
set price=20000
where class like 'fortran';

delete
from summer 
where sid=250;

delete
from summer 
where sid is null;
 
select *
from summer;

create table summerPrice
(class varchar(20),
price integer);

insert into summerPrice values('fortran',20000);
insert into summerPrice values('pascal',15000);
insert into summerPrice values('c',10000);

select *
from summerPrice;

create table summerEnroll
(sid integer,
class varchar(20));

insert into summerEnroll values (100, 'fortran');
insert into summerEnroll values (150, 'pascal');
insert into summerEnroll values (200, 'c');
insert into summerEnroll values (250, 'fortran');

select *
from summerEnroll;

select count(*), sum(price)
from summerPrice, summerEnroll
where summerPrice.class=summerEnroll.class;

select price'c수강료'
from summerPrice
where class like 'c';

delete
from summerEnroll
where sid=200;

select *
from summerEnroll;

select price'c수강료'
from summerPrice
where class like 'c';

insert into summerPrice values('java',25000);
select *
from summerPrice;

update summerPrice
set price=15000
where class='fortran';

select price'fortran 수강료'
from summerPrice
where class='fortran';

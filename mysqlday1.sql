select phone from customer where name='김연아';
select bookname,price from book;
select price,bookname from book;
select *from book;
select publisher from book;
select distinct publisher from book;
select * from book where price<20000;
select * from book where price between 10000 and 20000;
select * from book where publisher  IN('굿스포츠', '대한미디어');
select bookname as '책이름',publisher as '출판사' from book where bookname like "%축구의%";
select * from book where bookname like '_구%';
select * from book where bookname  ='골프' +'바이블';
select * from book where bookname like '%축구%' and price >=20000;
select * from book where bookname like '%축구%' or publisher = '대한미디어';
select * from book where bookname like '%축구%' or price <20000;
select * from book order by bookname;
select * from book order by bookname desc;
select * from book order by bookid desc;
select * from book order by price desc;
select * from book order by price, bookname;
select * from book order by price desc, publisher asc;
select sum(saleprice) from orders;
select saleprice from orders;
select sum(saleprice) as 합계 from orders;
select sum(saleprice) as 김연아합계 from orders where custid=2;
select sum(saleprice) as total, avg(saleprice) as avg, min(saleprice) as min, max(saleprice) as max from orders;
select count(*) as '카운트' from orders; 
select count(*) as '카운트' from orders where custid = 2;   
select custid, count(*) as '도서수량', sum(saleprice) as '총액' from orders group by custid;
select custid, count(*) as '도서수량', sum(saleprice) as '총액' from orders where custid = 2;
select custid, count(*) as '도서수량' from orders where saleprice >= 8000 group by custid having count(*)>=2;
#select bookid, sum(saleprice) from orders group by custid#;
select * from customer, orders;
select * from orders, customer where customer.custid = orders.custid;
select * from orders, customer where customer.custid = orders.custid order by customer.custid ;
select name, saleprice, orders.custid from customer, orders where customer.custid = orders.custid order by customer.custid;
select name, sum(saleprice) from customer,orders where customer.custid = orders.custid group by customer.name order by customer.name;
select customer.name, book.bookname from customer, orders, book where customer.custid = orders.custid and orders.bookid = book.bookid;
select customer.name, book.bookname from customer, orders, book where customer.custid = orders.custid and orders.bookid = book.bookid and book.price = 20000;
select customer.name, saleprice from customer left outer join orders on customer.custid = orders.custid;
select bookname from book where price = (select max(price) from book);
select bookname from book where price = (select min(price) from book);
select name from customer where custid in (select custid from orders);
select name from customer where custid in (select custid from orders where bookid in (select bookid from book where publisher = '대한미디어'));
select name from customer where custid in (select custid from orders where bookid in (select bookid from book where publisher = '굿스포츠'));
select b1.bookname from book b1 where b1.price > (select avg(b2.price) from book b2 where b2.publisher = b1.publisher);
select name from customer where address like '대한민국%' union select name from customer where custid in (select custid from orders);
select name from customer union select saleprice from orders;
select name from customer where address like '대한민국%' and name not in (select name from customer where custid in (select custid from orders));
select name from customer where address like '대한민국%' and name in (select name from customer where custid in (select custid from orders));
select name, address from customer cs where exists (select * from orders od where cs.custid = od.custid);
create table newbook (bookid integer, bookname varchar(20), publisher varchar(20), price integer);
insert into newbook values(1,'찬영이', 'codechan', 0);
insert into newbook values(2, '맘스터치', '백종원레시피', 50000);
select * from newbook;
delete from newbook where bookid=1;
select * from newbook;
create table newcustomer (custid integer primary key , name varchar(40), address varchar(40), phone varchar(30));
create table neworders (orderid integer, custid integer not null ,bookid integer not null, saleprice integer, orderdate date,primary key(orderid), foreign key(custid) references newcustomer(custid) on delete cascade);
alter table newbook add isbn varchar(13);
alter table newbook modify isbn integer;
alter table newbook drop column isbn;
alter table newbook modify bookid integer not null;
alter table newbook add primary key(bookid);
show tables;
show full columns from newbook;
desc newbook;
drop table newbook;
drop table newcustomer;
drop table neworders;
drop table newcustomer;
insert into book(bookid, bookname, publisher, price) values (11, '스포츠과학','한솔의학서적', 90000);
select * from book;
insert into book values(12, '스포츠학', '스포츠',98000);
select * from book;
insert into book(bookid, bookname, publisher) values (14, '스포츠의학', '한솔의학서적');
insert into book(bookid, bookname, price, publisher) select bookid, bookname, price, publisher from imported_book;
select * from book;
set sql_safe_updates = 0;
update customer set address = '대한민국 부산' where custid = 5;
select * from customer;
update book set publisher = (select publisher from imported_book where bookid = '21') where bookid = '14';
select * from book;
delete from book where bookid = '11';
select * from book;

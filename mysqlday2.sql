select orderid '주문번호', orderdate '주문일', ADDDATE(orderdate, interval 10 day) '확정' from orders;
select orderid '주문번호', str_to_date(orderdate, '%Y-%m-%d') '주문일', custid '고객번호', bookid '도서번호' from orders where orderdate = date_format('20140707', '%Y%m%d');
select orderid '주문번호', str_to_date(orderdate, '%Y-%m-%d') '주문일', custid '고객번호', bookid '도서번호' from orders where orderdate = '20140707';
select sysdate(), date_format(sysdate(), '%Y/%m/%d %M %h:%s') 'sysdate_1', date_format(sysdate(), '%w')'요일순서', date_format(sysdate(), '%a')'요일약자', date_format(sysdate(), '%j')'1년중날짜';
select * from orders;
select * from book;
select price + 100 from book;
select price +100 from book where bookid=24;
select sum(price), avg(price), count(*), count(price) from book;
select sum(price), avg(price), count(*) from book where bookid >= 25;
select * from book where price is null;
#$select * from book where price=' ';
select * from book where price is not null;
select name'이름',ifnull(phone, '연락처없음') '전화번호' from customer;
set @seq:=0; select (@seq:=@seq+1)'순번',custid, name, phone from customer where @seq<5;
select (select name from customer cs where cs.custid=od.custid )'name',sum(saleprice) 'total' from orders od group by od.custid;
alter table orders add bname varchar(40);
update orders set bname = (select bookname from book where book.bookid = orders.bookid);
select * from orders;
select cs.name, sum(od.saleprice)'total' from (select custid, name from customer where custid <=2)cs,orders od where cs.custid = od.custid group by cs.name;
select orderid, saleprice from orders where saleprice <= (select AVG(saleprice) from orders);
select orderid, custid, saleprice from orders md where saleprice > (select avg(saleprice) from orders so where md.custid = so.custid);
select sum(saleprice)'total' from orders where custid in (select custid from customer where address like '%대한민국%');
select orderid, saleprice from orders where saleprice > all (select saleprice from orders where custid = '3');
select orderid, saleprice from orders where saleprice < any (select saleprice from orders where custid = '3');
select sum(saleprice)'total' from orders od where exists (select * from customer cs where address like '%대한민국%' and cs.custid = od.custid);

use madang;
delimiter //
create procedure insertbook (
in mybookid integer,
in mybookname varchar(40),
in mypublisher varchar(40),
in myprice integer)
begin
insert into book(bookid, bookname, publisher, price)
values(mybookid, mybookname, mypublisher, myprice);
end;
//
delimiter ;

call insertbook(30,'스포츠과학','마당과학서적',25000);
select * from book;

use madang;
delimiter //
create procedure bookinsertorupdate(
mybookid integer,
mybookname varchar(40),
mypublisher varchar(40),
myprice integer)
begin
declare mycount integer;
select count(*) into mycount from book
where bookname like mybookname;
if mycount!=0 then
set sql_safe_updates = 0;
update book set price = myprice
where bookname like mybookname;
else
insert into book(bookid, bookname, publisher, price)
values(mybookid, mybookname, mypublisher, myprice);
end if;
end;
//
delimiter ;
call bookinsertorupdate(30, '스포츠과학', '마당과학서적', 25000);
select * from book;
call bookinsertorupdate(30, '스포츠과학', '마당과학서적', 20000);
select * from book;

delimiter //
create procedure averageprice(
out averageval integer)
begin
select avg(price) into averageval
from book where price is not null;
end;
//
delimiter ;
call averageprice(@myvalue);
select @myvalue;

delimiter // 
create procedure interest()
begin
declare myinterest integer default 0.0;
declare price integer;
declare endofrow boolean default false;
declare interestcursor cursor for
select saleprice from orders;
declare continue handler
for not found set endofrow = true;
open interestcursor;
cursor_loop:loop
fetch interestcursor into price;
if endofrow then leave cursor_loop;
end if;
if price >= 30000 then
set myinterest = myinterest + price*0.1;
else
set myinterest = myinterest + price*0.05;
end if;
end loop cursor_loop;
close interestcursor;
select concat('전체이익금액=',myinterest);
end;
//
delimiter ;
/* interest 프로시저를 실행하여 판매된 도서에 대한 이익금을 계산*/
call interest();
set global log_bin_trust_function_creators=on;
create table book_log(
bookid_l integer,
bookname_l varchar(40),
publisher_l varchar(40),
price_l integer);
delimiter //
create trigger afterinsertbook
after insert on book for each row
begin
declare average integer;
insert into book_log
values(new.bookid,new.bookname,new.publisher,new.price);
end;
//
delimiter ;
insert into book values(32, '스포츠 과학 1','이상미디어',25000);
select * from book where bookid=32;
select * from book_log where bookid_l='32' ;
select * from book;

delimiter //
create function fnc_interest(
price integer) returns int
begin
declare myinterest integer;
-- 가격이 30000원 이상이면 10% 30000원 미만이면 5%
if price >= 30000 then set myinterest = price*0.1;
else set myinterest := price * 0.05;
end if;
return myinterest;
end; //
delimiter ;
/*Orders테이블에서 각 주문에 대한 이익을 출력*/
select custid, orderid, saleprice, fnc_interest(saleprice) interest
from orders;

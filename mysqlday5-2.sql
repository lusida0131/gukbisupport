start transaction;
use madang;
select *
from book
where bookid=1;
update book
set price=price+100
where bookid=1;
select *
from book
where bookid=1;
commit;

start transaction;
use madang;
update book
set price=price*1.1
where bookid=2;

update book
set price=price*1.1
where bookid=1;

commit;

set transaction isolation level read committed;
start transaction;
use madang;
set sql_safe_updates=0;
update users
set age=21
where id=1;
select *
from users
where id=1;

rollback;

set transaction isolation level read committed;
start transaction;
use madang;
set sql_safe_updates=0;
update users
set age=21
where id=1;

commit;

select *
from users
where id=1;

set transaction isolation level read committed;
start transaction;
use madang;
select sum(price)총액
from book;

update book
set price=price+500
where bookid=1;
select sum(price)총액
from book;
commit;

set transaction isolation level read committed;
start transaction;
use madang;
set sql_safe_updates=0;
update book
set price=price+500
where bookid=1;

select sum(price)총액
from book;
commit;

set transaction isolation level read committed;
start transaction;
use madang;
select sum(price)총액
from book;
insert into book values(15, '테스트', '테스트출판사', 5500);

select sum(price)총액
from book;
commit;
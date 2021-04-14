start transaction;
use madang;

select *
from book
where bookid=1;

update book
set price=7100
where bookid=1;

select *
from book
where bookid=1;
commit;

start transaction;
use madang;
update book
set price=price+100
where bookid=1;

update book
set price=price+100
where bookid=2;

commit;

drop table if exists users;

create table users
(id integer,
name varchar(20),
age integer);

insert into users values (1, 'hong Gildong', 30);
select *
from users;
commit;

set transaction isolation level read uncommitted;
start transaction;
use madang;

select *
from users
where id=1;

select *
from users
where id=1;

select *
from users
where id=1;
commit;

set transaction isolation level read committed;
start transaction;
use madang;

select*
from users
where id=1;

select *
from users
where id=1;

commit;

update users
set age=30
where id=1;

set transaction isolation level read committed;
start transaction;
use madang;
select sum(price)총액
from book;

select sum(price)총액
from book;

commit;

set transaction isolation level repeatable read;
start transaction;
use madang;
select sum(price)총액
from book;

select sum(price)총액
from book;
commit;

set  transaction isolation level serializable;
start transaction;
use madang;
select sum(price)총액
from book;

select sum(price)총액
from book;

commit;
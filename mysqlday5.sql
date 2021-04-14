start transaction;
insert into Book values(99,'데이터베이스', '한빛', 25000);
select bookname 'bookname1' from Book
where bookid=99;
savepoint a;

update Book set bookname='데이터베이스 개론' where bookid=99;
select bookname 'bookname2' from Book
where bookid=99;
savepoint b;

update Book set bookname='데이터베이스 개론 및 실습' where bookid=99;
select bookname 'bookname3' from book
where bookid=99;

rollback to b;
select bookname 'bookname4' from book
where bookid=99;

rollback to a;
select bookname 'bookname5' from book
where bookid=99;
commit;

start transaction;

update book set bookname='데이터베이스 개론 및 실습2' where bookid=99;
select bookname 'bookname6' from book
where bookid=99;
rollback;

select bookname 'bookname7' from book
where bookid=99;

delete from book where bookid=99;
commit;
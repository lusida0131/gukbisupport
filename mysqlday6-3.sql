create user mdguest@'localhost' identified by 'mdguest';
select * from user where user like 'mdguest';

create user mdguest2@'localhost' identified by 'mdguest2';
select * from user where user like 'mdguest2';

grant all privileges on *.* to madang@localhost with grant option;
flush privileges;
show grants for madang@localhost;

use madang;
set sql_safe_updates=0;
delete from orders;
select * from orders;

use madang;
select * from orders;
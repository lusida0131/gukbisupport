grant select on madang.book to mdguest@localhost;
grant select, update on madang.customer to mdguest@localhost
with grant option;

revoke select on madang.book from mdguest@localhost;
revoke select on madang.customer from mdguest@localhost;
revoke update on madang.customer from mdguset@localhost;
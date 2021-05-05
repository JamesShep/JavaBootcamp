select * From users;
select * from address;

select * from users
join address on users.user_id = address.user_id;

insert into address (user_id, address_line_1, address_line_2, city, suburb, country, post_code)
values (5, '1 Musk Drive', 'Suite 205', 'Some City', 'California', 'USA', '9021');

select * from users 
left join address on users.user_id = address.user_id;

-- users   |   address
--   1     |      1
--   2     |      -
--   3     |      -
--   4     |      -
--   5     |      2
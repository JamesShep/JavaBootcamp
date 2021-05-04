-- Create, Read, Update, Delete

select * from users;

select * from transactions;

select first_name from users;
select first_name, last_name from users;

insert into transactions (transaction_id, transaction_date, amount, type)
values (1, '2021-01-31 15:01:00', 20, 'D');

insert into transactions (transaction_id, transaction_date, amount, type)
values (2, '2021-01-30 17:04:32', 19.99, 'D');

insert into transactions (transaction_id, transaction_date, amount, type)
values (3, '2021-02-25 11:21:52', 119.99, 'D');

-- amount decimal (2) -> amount decimal(2, 0) -> decimal (precision, scale)

alter table transactions
change column amount amount decimal(6,2);